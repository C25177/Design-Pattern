package TemplateMethod;

public abstract class Base {
  public void part1() {
    System.out.println("Base: part1");
  }
  public void part2() {
    System.out.println("Base: part2");
  }
  public void part3() {
    System.out.println("Base: part3");
  }
  
  public void run() {
    part1();
    part2();
    part3();
  }
}

