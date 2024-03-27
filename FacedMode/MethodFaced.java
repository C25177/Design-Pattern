package FacedMode;

public class MethodFaced {
  private MethodA a = new MethodA();
  private MethodB b = new MethodB();

  public void runMethodA() {
    a.runMethodA();
  }
  
  public void runMethodB() {
    b.runMethodB();
  }
}
