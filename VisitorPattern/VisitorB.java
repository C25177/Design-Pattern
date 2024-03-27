package VisitorPattern;

public class VisitorB implements Visitor{
  @Override
  public void visit(ElementA _element) {
    System.out.print("visitor B\t");
    _element.operateA();
  }
  
  @Override
  public void visit(ElementB _element) {
    System.out.print("visitor B\t");
    _element.operateB();
  }  
}
