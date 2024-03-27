package VisitorPattern;

public class VisitorA implements Visitor{
  @Override
  public void visit(ElementA _element) {
    System.out.print("visitor A\t");
    _element.operateA();
  }
  
  @Override
  public void visit(ElementB _element) {
    System.out.print("visitor A\t");
    _element.operateB();
  }
}
