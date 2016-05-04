package com.jasongj.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubjectProxyHandler implements InvocationHandler {

  private static final Logger LOG = LoggerFactory.getLogger(SubjectProxyHandler.class);

  private Object target;
  
  @SuppressWarnings("rawtypes")
  public SubjectProxyHandler(Class clazz) {
    try {
      this.target = clazz.newInstance();
    } catch (InstantiationException | IllegalAccessException ex) {
      LOG.error("Create proxy for {} failed", clazz.getName());
    }
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    preAction();
    Object result = method.invoke(target, args);
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
