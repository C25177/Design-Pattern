package CompositePattern;

public class Leaf extends Node {
  public Leaf(String _name) {
    super(_name);
  }

  @Override
  public void operate() {
    System.out.println("leaf:" + name);
  }
}
