package com.jasongj.client;

import com.jasongj.context.SimpleFactoryContext;

public class SimpleFactoryClient {

  public static void main(String[] args) {
    SimpleFactoryContext context = new SimpleFactoryContext();
    context.action("Hellow, world");
  }

}
