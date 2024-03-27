package ResponsibilityChain;

public class HandlerB extends Handler {
  @Override
  public void operate(String ID) {
    if(ID == "msgB") 
      System.out.println("handlerB operate");
    if(next == null)
      return;
    next.operate(ID);
  }
  
}
