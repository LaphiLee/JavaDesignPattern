package com.jasongj.brand;

import com.jasongj.transmission.Transmission;

public abstract class AbstractCar {

  protected Transmission gear;
  
  public abstract void run();
  
  public void setTransmission(Transmission gear) {
    this.gear = gear;
  }
  
}
