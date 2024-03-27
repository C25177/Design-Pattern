package VisitorPattern;

public class main {
  public static void main(String[] args) {
    Visitor vA = new VisitorA();
    Visitor vB = new VisitorB();
    Subject sub = new Subject();
    Element eA = new ElementA();
    Element eB = new ElementB();

    sub.add(eA);
    sub.add(eB);

    sub.accept(vA);
    sub.accept(vB);
  }
  
}
