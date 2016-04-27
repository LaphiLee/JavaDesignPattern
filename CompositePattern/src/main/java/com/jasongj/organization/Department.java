package com.jasongj.organization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department extends Organization{
  
  public Department(String name) {
    super(name);
  }

  private static Logger LOGGER = LoggerFactory.getLogger(Department.class);
  
  public void inform(String info){
    LOGGER.info("{}-{}", info, getName());
  }

}
