package com.jasongj.client;

import com.jasongj.brand.AbstractCar;
import com.jasongj.brand.BMWCar;
import com.jasongj.brand.BenZCar;
import com.jasongj.transmission.Auto;
import com.jasongj.transmission.Manual;
import com.jasongj.transmission.Transmission;

public class BridgeClient {

  public static void main(String[] args) {
    Transmission auto = new Auto();
    AbstractCar bmw = new BMWCar();
    bmw.setTransmission(auto);
    bmw.run();
    

    Transmission manual = new Manual();
    AbstractCar benz = new BenZCar();
    benz.setTransmission(manual);
    benz.run();
  }

}
