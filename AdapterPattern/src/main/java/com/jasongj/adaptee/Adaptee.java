package com.jasongj.adaptee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.target.ConcreteTarget;

public class Adaptee {

  private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);

  public void onRequest() {
    LOGGER.info("Adaptee.onRequest()");
  }

}
