package com.yifuyou.pro.util;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.google.common.net.HttpHeaders.AUTHORIZATION;
import static com.google.common.net.HttpHeaders.ORIGIN;

public class TokenUtil extends HandlerInterceptorAdapter {
    public static String getToken() {
        //用两个随机uuid作为token
        //  return (UUID.randomUUID().toString()+UUID.randomUUID().toString());
        return "token1111111111111";
    }

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(AUTHORIZATION);
        String username = request.getHeader(ORIGIN);
        System.out.println(token);
        System.out.println("======================");
        System.out.println(username);
        if (token == null) return false;
        HttpSession session = request.getSession();
        if (token.equals(session.getAttribute(username))) {
            return true;
        }

        return false;
    }


}
