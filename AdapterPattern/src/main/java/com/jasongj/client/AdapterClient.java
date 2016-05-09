package com.jasongj.client;

import com.jasongj.target.Adapter;
import com.jasongj.target.ConcreteTarget;
import com.jasongj.target.ITarget;

public class AdapterClient {

  public static void main(String[] args) {
    ITarget adapter = new Adapter();
    adapter.request();

    ITarget target = new ConcreteTarget();
    target.request();
  }

}
