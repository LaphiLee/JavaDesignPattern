package com.jasongj.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteFlyWeight implements FlyWeight {

  private static final Logger LOG = LoggerFactory.getLogger(ConcreteFlyWeight.class);

  private String name;

  public ConcreteFlyWeight(String name) {
    this.name = name;
  }

  @Override
  public void action(String externalState) {
    LOG.info("name = {}, outerState = {}", this.name, externalState);
  }

}
