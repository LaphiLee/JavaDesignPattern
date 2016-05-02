package com.jasongj.client;

import com.jasongj.proxy.ProxySubject;
import com.jasongj.subject.ISubject;

public class StaticProxyClient {

  public static void main(String[] args) {
    ISubject subject = new ProxySubject();
    subject.action();
  }

}
