package StatePattern;

public class CloseState extends NetworkState {
  @Override
  public void Operation1() {
    System.out.println("close operation1");
  }
  
  @Override
  public void Operation2() {
    System.out.println("close operation2");
  }
  
  @Override
  public void Operation3() {
    System.out.println("close operation3");
  }  
}
