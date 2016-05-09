package com.jasongj.target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.adaptee.Adaptee;

public class Adapter implements ITarget {

  private static Logger LOG = LoggerFactory.getLogger(Adapter.class);

  private Adaptee adaptee = new Adaptee();

  @Override
  public void request() {
    LOG.info("Adapter.request");
    adaptee.onRequest();
  }

}
