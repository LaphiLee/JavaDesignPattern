package com.jasongj.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@com.jasongj.annotation.Strategy(name="StrategyB")
public class ConcreteStrategyB implements Strategy {

  private static final Logger LOG = LoggerFactory.getLogger(ConcreteStrategyB.class);

  @Override
  public void strategy(String input) {
    LOG.info("Strategy B for input : {}", input);
  }

}
