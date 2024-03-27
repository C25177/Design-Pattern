package ResponsibilityChain;

public class main {
  public static void main(String[] args) {
    Handler handlerA = new HandlerA();
    Handler handlerB = new HandlerB();
    Handler handlerA1 = new HandlerA();
    Handler handlerB1 = new HandlerB();
    handlerA.setnext(handlerB);
    handlerB.setnext(handlerA1);
    handlerA1.setnext(handlerB1);
    handlerA.operate("msgB");
  }
}
