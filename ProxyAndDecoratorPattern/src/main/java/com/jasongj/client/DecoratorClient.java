package com.jasongj.client;

import com.jasongj.decorator.SubjectPostDecorator;
import com.jasongj.decorator.SubjectPreDecorator;
import com.jasongj.subject.ConcreteSubject;
import com.jasongj.subject.ISubject;

public class DecoratorClient {

  public static void main(String[] args) {
    ISubject subject = new ConcreteSubject();
    ISubject preDecorator = new SubjectPreDecorator(subject);
    ISubject postDecorator = new SubjectPostDecorator(preDecorator);
    postDecorator.action();

  }

}
