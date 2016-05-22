package com.jasongj.client;

import com.jasongj.factory.FlyWeightFactory;
import com.jasongj.flyweight.FlyWeight;

public class FlyWeightClient {

  public static void main(String[] args) {
    FlyWeight bmw1 = FlyWeightFactory.getFlyWeight("bmw");
    FlyWeight bmw2 = FlyWeightFactory.getFlyWeight("bmw");
    FlyWeight bmw3 = FlyWeightFactory.getFlyWeight("bmw");
    
    bmw1.action("start");
    bmw2.action("stop");
    bmw3.action("boost");

  }

}
