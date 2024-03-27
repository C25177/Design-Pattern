package PrototypeMode;

import java.io.IOException;

public class main {
  public static void main(String[] args) {
    Prototype p, copyp;
    p = new Prototype();
    p.setName("is p");
    copyp = (Prototype) p.clone();
    System.out.println(p == copyp);
    System.out.println(p.name == copyp.name);

    Prototype deepcopyp = null;
    try{
      deepcopyp = (Prototype) p.deepClone();
      System.out.println(p == deepcopyp);
      System.out.println(p.name == deepcopyp.name);
    }
    catch (Exception e) {
      System.out.println("something wrong");
      e.printStackTrace();
    }
  }
}
