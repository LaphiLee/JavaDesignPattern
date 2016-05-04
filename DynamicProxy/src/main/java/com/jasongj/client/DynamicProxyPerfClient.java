package com.jasongj.client;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.proxy.cglibproxy.SubjectInterceptor;
import com.jasongj.proxy.jdkproxy.SubjectProxyHandler;
import com.jasongj.subject.ConcreteSubject;
import com.jasongj.subject.ISubject;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class DynamicProxyPerfClient {

  private static final Logger LOG = LoggerFactory.getLogger(DynamicProxyPerfClient.class);
  private static int creation = 100000000;
  private static int execution = 1000000000;

  public static void main(String[] args) throws IOException {
    testJDKDynamicCreation();
    testJDKDynamicExecution();
    testCglibCreation();
    testCglibExecution();
  }

  private static void testJDKDynamicCreation() {
    long start = System.currentTimeMillis();
    for (int i = 0; i < creation; i++) {
      InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
      Proxy.newProxyInstance(DynamicProxyPerfClient.class.getClassLoader(),
          new Class[] {ISubject.class}, handler);
    }
    long stop = System.currentTimeMillis();
    LOG.info("JDK creation time : {} ms", stop - start);
  }

  private static void testJDKDynamicExecution() {
    long start = System.currentTimeMillis();
    InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
    ISubject subject =
        (ISubject) Proxy.newProxyInstance(DynamicProxyPerfClient.class.getClassLoader(),
            new Class[] {ISubject.class}, handler);
    for (int i = 0; i < execution; i++) {
      subject.action();
    }
    long stop = System.currentTimeMillis();
    LOG.info("JDK execution time : {} ms", stop - start);
  }

  private static void testCglibCreation() {
    long start = System.currentTimeMillis();
    for (int i = 0; i < creation; i++) {
      MethodInterceptor methodInterceptor = new SubjectInterceptor();
      Enhancer enhancer = new Enhancer();
      enhancer.setSuperclass(ConcreteSubject.class);
      enhancer.setCallback(methodInterceptor);
      enhancer.create();
    }
    long stop = System.currentTimeMillis();
    LOG.info("cglib creation time : {} ms", stop - start);
  }

  private static void testCglibExecution() {
    MethodInterceptor methodInterceptor = new SubjectInterceptor();
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(ConcreteSubject.class);
    enhancer.setCallback(methodInterceptor);
    ISubject subject = (ISubject) enhancer.create();
    long start = System.currentTimeMillis();
    for (int i = 0; i < execution; i++) {
      subject.action();
    }
    long stop = System.currentTimeMillis();
    LOG.info("cglib execution time : {} ms", stop - start);
  }

}
