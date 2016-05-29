package com.jasongj.context;

import com.jasongj.strategy.Strategy;

public class SimpleContext {

  private Strategy strategy;
  
  public SimpleContext(Strategy strategy) {
    this.strategy = strategy;
  }
  
  public void action(String input) {
    strategy.strategy(input);
  }
  
}
