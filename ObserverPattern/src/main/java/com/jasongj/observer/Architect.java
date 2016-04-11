package com.jasongj.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Architect implements ITalent {
  
  private static final Logger LOG = LoggerFactory.getLogger(Architect.class);

  @Override
  public void newJob(String job) {
    LOG.info("Architect get new position {}", job);
  }

}
