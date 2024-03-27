package VisitorPattern;

public class ElementB implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  public void operateB() {
    System.out.println("elementB operate");
  }
  
}
