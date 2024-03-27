package CompositePattern;

public class main {
  public static void main(String[] args) {
    Branch branch1 = new Branch("branch1");
    Branch branch2 = new Branch("branch2");
    Node leaf1 = new Leaf("leaf1");
    Node leaf2 = new Leaf("leaf2");

    branch1.add(leaf2);
    branch1.add(branch2);
    branch2.add(leaf1);

    branch1.operate();
  }
}
