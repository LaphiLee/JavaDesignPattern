package com.jasongj.client;

import com.jasongj.context.SimpleContext;
import com.jasongj.strategy.ConcreteStrategyA;
import com.jasongj.strategy.Strategy;

public class SimpleClient {

  public static void main(String[] args) {
    Strategy strategy = new ConcreteStrategyA();
    SimpleContext context = new SimpleContext(strategy);
    context.action("Hellow, world");
  }

}
