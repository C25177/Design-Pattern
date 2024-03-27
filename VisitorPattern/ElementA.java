package VisitorPattern;

public class ElementA implements Element{
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  public void operateA() {
    System.out.println("elementA operate");
  }
}
