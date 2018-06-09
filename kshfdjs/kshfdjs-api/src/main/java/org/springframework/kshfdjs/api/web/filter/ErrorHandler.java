package org.springframework.kshfdjs.api.web.filter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.kshfdjs.module.response.StatusCode;
import org.springframework.kshfdjs.module.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author suijie
 */
@ControllerAdvice
@ResponseBody
public class ErrorHandler {
    private final static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);


    @ExceptionHandler(JsonMappingException.class)
    public Response handlerException(JsonMappingException e) {
        logger.error(StatusCode.JSON_FORMAT_ERROR.getCode(), e);
        return new Response(StatusCode.JSON_FORMAT_ERROR);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Response handlerException(HttpMessageNotReadableException e) {
        logger.error(StatusCode.HTTP_ACESS_ERROR.getCode(), e);
        return new Response(StatusCode.HTTP_ACESS_ERROR);
    }

    @ExceptionHandler(JsonParseException.class)
    public Response handlerException(JsonParseException e) {
        logger.error(StatusCode.JSON_FORMAT_ERROR.getCode(), e);
        return new Response(StatusCode.JSON_FORMAT_ERROR);
    }

    @ExceptionHandler(InvalidFormatException.class)
    public Response handlerException(InvalidFormatException e) {
        logger.error("错误", e);
        return new Response(StatusCode.DATA_FORMAT_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public Response handlerException(Exception e) {
        logger.error(StatusCode.SERVICE_RUN_ERROR.getCode(), e);
        return Response.failureResponse();
    }

}

