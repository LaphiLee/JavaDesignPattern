package com.jasongj.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeniorEngineer implements ITalent {
  
  private static final Logger LOG = LoggerFactory.getLogger(SeniorEngineer.class);

  @Override
  public void newJob(String job) {
    LOG.info("Senior engineer get new position {}", job);
  }

}
