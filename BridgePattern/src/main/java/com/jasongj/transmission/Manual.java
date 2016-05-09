package com.jasongj.transmission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manual extends Transmission {

  private static final Logger LOG = LoggerFactory.getLogger(Manual.class);

  @Override
  public void gear() {
    LOG.info("Manual transmission");
  }
}
