package StatePattern;

public class ConnectState extends NetworkState{
  @Override
  public void Operation1() {
    System.out.println("connect operation1");
  }
  
  @Override
  public void Operation2() {
    System.out.println("connect operation2");
  }
  
  @Override
  public void Operation3() {
    System.out.println("connect operation3");
  } 
}
