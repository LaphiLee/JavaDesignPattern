package com.jasongj.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JuniorEngineer implements ITalent {
  
  private static final Logger LOG = LoggerFactory.getLogger(JuniorEngineer.class);

  @Override
  public void newJob(String job) {
    LOG.info("Junior engineer get new position {}", job);
  }

}
