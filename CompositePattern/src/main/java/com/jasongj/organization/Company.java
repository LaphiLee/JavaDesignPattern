package com.jasongj.organization;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Company extends Organization{
  
  private static Logger LOGGER = LoggerFactory.getLogger(Company.class);
  
  public Company(String name) {
    super(name);
  }

  public void inform(String info){
    LOGGER.info("{}-{}", info, getName());
    List<Organization> allOrgs = getAllOrgs();
    allOrgs.forEach(org -> org.inform(info+"-"));
  }

}
