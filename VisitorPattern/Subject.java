package VisitorPattern;

import java.util.ArrayList;

public class Subject {
  ArrayList<Element> list = new ArrayList<Element>();
  public void accept(Visitor _v) {
    for(Element e : list) {
      e.accept(_v);
    }
  }
  public void add(Element _element) {
    list.add(_element);
  }
  
  public void remove(Element _element) {
    list.remove(_element);
  }
}
