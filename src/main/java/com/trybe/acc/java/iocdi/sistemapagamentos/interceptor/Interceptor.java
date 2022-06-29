package com.trybe.acc.java.iocdi.sistemapagamentos.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class Interceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {

    final RestritoPermissaoEscrita restritoPermissaoEscrita = ((HandlerMethod) handler)
        .getMethod().getAnnotation((RestritoPermissaoEscrita.class));

    if (restritoPermissaoEscrita != null) {
      response.addHeader("InterceptorTrybe",
          "Pessoa administradora validada pelo interceptor da trybe");
      return true;
    } else {
      return false;
    }

  }
}
