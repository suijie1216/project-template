package org.springframework.kshfdjs.api.web.config;

import org.springframework.kshfdjs.api.web.filter.QPSFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.litchi.profile.qps.QPSCounterWorker;
import org.springframework.litchi.profile.qps.QPSListener;
import org.springframework.litchi.profile.qps.QPSNode;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author suijie
 */
@Configuration
public class FilterConfig extends WebMvcConfigurerAdapter {
    private final static Logger logger = LoggerFactory.getLogger("trace-log");
    @Resource
    private QPSFilter qpsFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(qpsFilter).addPathPatterns("/api/**");
    }

    @Bean
    public QPSCounterWorker buildQPSCounterWorker() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        QPSListener listener = new QPSListener() {
            @Override
            public void event(QPSNode node) {
                String result = String.format("api:%s,time:%s,qps:%s,rt:%s",
                        node.getPath(),
                        format.format(new Date(node.getTime())),
                        node.getQps(),
                        node.getRt().longValue() / node.getQps().intValue());
                logger.info(result);
            }
        };
        return new QPSCounterWorker(listener);
    }

}
