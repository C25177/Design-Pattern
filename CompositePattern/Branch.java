package CompositePattern;

import java.util.ArrayList;

public class Branch extends Node {
  ArrayList<Node> nodes = new ArrayList<Node>();

  public Branch(String _name) {
    super(_name);
  }

  @Override
  public void operate() {
    System.out.println("branch:" + name);
    for(Node node : nodes) {
      node.operate();
    }
  }

  public void add(Node _node) {
    nodes.add(_node);
  }

  public void remove(Node _node) {
    nodes.remove(_node);
  }
}
