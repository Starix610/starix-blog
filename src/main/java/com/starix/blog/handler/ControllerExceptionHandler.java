package com.starix.blog.handler;

import com.starix.blog.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Starix
 * @date 2020-05-03 20:58
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e){
        log.error("Request URL : {}, Exception : ", request.getRequestURL(), e);
        ModelAndView mv = new ModelAndView();
        mv.addObject("url", request.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");
        return mv;
    }

    /**
     * 自定义的NotFoundException（文章不存在）
     */
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView notFoundExceptionHandler(HttpServletRequest request, Exception e){
        log.error("Request URL : {}, Exception : ", request.getRequestURL(), e);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error/404");
        return mv;
    }

}
