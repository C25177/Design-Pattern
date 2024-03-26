package TemplateMethod;

public class main {
  public static void main(String[] args) {
    Base b1 = new Branch1();
    Base b2 = new Branch2();
    b1.run();
    b2.run();
  }
}
