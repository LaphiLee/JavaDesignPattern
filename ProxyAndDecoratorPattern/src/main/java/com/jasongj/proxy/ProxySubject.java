package com.jasongj.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

import com.jasongj.subject.ConcreteSubject;
import com.jasongj.subject.ISubject;

public class ProxySubject implements ISubject {

  private static final Logger LOG = LoggerFactory.getLogger(ProxySubject.class);

  private ISubject subject;

  public ProxySubject() {
    subject = new ConcreteSubject();
  }

  @Override
  public void action() {
    preAction();
    if((new Random()).nextBoolean()){
      subject.action();
    } else {
      LOG.info("Permission denied");
    }
    postAction();
  }

  private void preAction() {
    LOG.info("ProxySubject.preAction()");
  }

  private void postAction() {
    LOG.info("ProxySubject.postAction()");
  }

}
