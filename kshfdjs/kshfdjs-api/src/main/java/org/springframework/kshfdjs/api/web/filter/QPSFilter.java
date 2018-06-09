package org.springframework.kshfdjs.api.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.litchi.profile.qps.QPSCounterWorker;
import org.springframework.litchi.profile.trace.Trace;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author suijie
 */
@Service
public class QPSFilter implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger("trace-log");

    @Resource
    private QPSCounterWorker qpsCounterWorker;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        String path = httpServletRequest.getServletPath();
        Trace.traceIn(path);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        try {
            String path = httpServletRequest.getServletPath();
            Trace.traceOut(path);
            long cost = Trace.getCost(path);
            qpsCounterWorker.increment(path, cost);
            if (cost > 200L) {
                logger.info(Trace.printTrace());
            }
        } finally {
            Trace.reset();
        }

    }
}
