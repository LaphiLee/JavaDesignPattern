package com.jasongj.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiProxyHandler implements InvocationHandler {

  private static final Logger LOG = LoggerFactory.getLogger(SubjectProxyHandler.class);

  private Object target;
  
  @SuppressWarnings("rawtypes")
  public MultiProxyHandler(Class clazz) {
    try {
      this.target = clazz.newInstance();
    } catch (InstantiationException | IllegalAccessException ex) {
      LOG.error("Create proxy for {} failed", clazz.getName());
    }
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    switch(method.getName()) {
      case "hashCode":
        return ((int)method.invoke(target, args)) + 1;
      case "equals":
        return (boolean)method.invoke(target, args);
      case "toString":
        return method.invoke(target, args) + "";
      case "action":
        preAction();
        Object result = method.invoke(target, args);
        postAction();
        return result;
      default:
        return method.invoke(target, args);
    }
  }

  private void preAction() {
    LOG.info("SubjectProxyHandler.preAction()");
  }

  private void postAction() {
    LOG.info("SubjectProxyHandler.postAction()");
  }

}
