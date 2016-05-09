package com.jasongj.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BMWCar extends AbstractCar{

  private static final Logger LOG = LoggerFactory.getLogger(BMWCar.class);
  
  @Override
  public void run() {
    gear.gear();
    LOG.info("BMW is running");
  };

}
