package com.jasongj.transmission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Auto extends Transmission {

  private static final Logger LOG = LoggerFactory.getLogger(Auto.class);

  @Override
  public void gear() {
    LOG.info("Auto transmission");
  }
}
