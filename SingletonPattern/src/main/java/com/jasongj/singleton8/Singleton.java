package com.jasongj.singleton8;

public class Singleton {

  private Singleton() {};

  public static Singleton getInstance() {
    return InnerClass.INSTANCE;
  }
  
  private static class InnerClass {
    private static final Singleton INSTANCE = new Singleton();
  }

}
