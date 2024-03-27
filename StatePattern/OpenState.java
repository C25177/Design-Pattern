package StatePattern;

public class OpenState extends NetworkState {
  @Override
  public void Operation1() {
    System.out.println("open operation1");
  }
  
  @Override
  public void Operation2() {
    System.out.println("open operation2");
  }
  
  @Override
  public void Operation3() {
    System.out.println("open operation3");
  }
}
