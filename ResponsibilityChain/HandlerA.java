package ResponsibilityChain;

public class HandlerA extends Handler {
  @Override
  public void operate(String ID) {
    if(ID == "msgA") 
      System.out.println("handlerA operate");
    if(next == null)
      return;
    next.operate(ID);
  }
}
