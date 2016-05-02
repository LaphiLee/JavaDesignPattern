package com.jasongj.client;

import com.jasongj.observer.Architect;
import com.jasongj.observer.ITalent;
import com.jasongj.observer.JuniorEngineer;
import com.jasongj.observer.SeniorEngineer;
import com.jasongj.subject.HeadHunter;
import com.jasongj.subject.AbstractHR;

public class Client1 {

  public static void main(String[] args) {
    ITalent juniorEngineer = new JuniorEngineer();
    ITalent seniorEngineer = new SeniorEngineer();
    ITalent architect = new Architect();
    
    AbstractHR subject = new HeadHunter();
    subject.addTalent(juniorEngineer);
    subject.addTalent(seniorEngineer);
    subject.addTalent(architect);
    
    subject.publishJob("Top 500 big data position");
  }

}
