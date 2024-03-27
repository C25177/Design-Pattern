package CompositePattern;

public abstract class Node {
  String name;
  public Node(String _name) {
    name = _name;
  }
  public abstract void operate();
}
