package com.jasongj.brand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandRoverCar extends AbstractCar{

  private static final Logger LOG = LoggerFactory.getLogger(LandRoverCar.class);
  
  @Override
  public void run() {
    gear.gear();
    LOG.info("LandRoverCar is running");
  };

}
