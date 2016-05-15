package com.jasongj.singleton7;

public class Singleton {

  private static Singleton INSTANCE;
  
  static{
    INSTANCE = new Singleton();
  }

  private Singleton() {};

  public static Singleton getInstance() {
    return INSTANCE;
  }

}
