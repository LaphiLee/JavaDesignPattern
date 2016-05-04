package com.jasongj.proxy.cglibproxy;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class SubjectInterceptor implements MethodInterceptor {

  private static final Logger LOG = LoggerFactory.getLogger(SubjectInterceptor.class);

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {
    preAction();
    Object result = proxy.invokeSuper(obj, args);
    postAction();
    return result;
  }

  private void preAction() {
//    LOG.info("SubjectProxyHandler.preAction()");
  }

  private void postAction() {
//    LOG.info("SubjectProxyHandler.postAction()");
  }

}
