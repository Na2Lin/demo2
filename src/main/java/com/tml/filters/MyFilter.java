package com.tml.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyFilter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("pre-handle");
        if(handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Alass methodAnnotation = handlerMethod.getMethodAnnotation(Alass.class);
            Alass annotation = handlerMethod.getBeanType().getAnnotation(Alass.class);
            if(methodAnnotation == null && annotation == null) {
                return super.preHandle(request,response,handler);
            }
            boolean flag = true;

            if(methodAnnotation != null && !methodAnnotation.validate()) {
                return super.preHandle(request,response,handler);
            }
            if(annotation != null && annotation.validate()) {
                // TODO  拦截逻辑
            }
            if(methodAnnotation != null) {
                if(annotation == null) {
                    // TODO  拦截逻辑
                }
            }
            if(!flag) {
                // TODO  被拦截后的逻辑操作
            }
            return super.preHandle(request,response,handler);
        }
        return super.preHandle(request, response, handler);
    }
}
