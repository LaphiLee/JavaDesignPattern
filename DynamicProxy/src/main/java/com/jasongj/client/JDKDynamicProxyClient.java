package com.jasongj.client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.proxy.jdkproxy.SubjectProxyHandler;
import com.jasongj.subject.ConcreteSubject;
import com.jasongj.subject.ISubject;

import sun.misc.ProxyGenerator;

public class JDKDynamicProxyClient {

  private static final Logger LOG = LoggerFactory.getLogger(JDKDynamicProxyClient.class);
  
  public static void main(String[] args) throws IOException {
    InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
    ISubject subject =
        (ISubject) Proxy.newProxyInstance(JDKDynamicProxyClient.class.getClassLoader(),
            new Class[] {ISubject.class}, handler);
    subject.action();
    LOG.info("Proxy class name {}", subject.getClass().getName());
    byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy18", ConcreteSubject.class.getInterfaces());  
    try(OutputStream outputStream = new FileOutputStream("$Proxy18.class")){
      IOUtils.write(classFile, outputStream);
    }
  }

}
