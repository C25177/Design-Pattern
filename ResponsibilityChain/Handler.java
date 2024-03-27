package ResponsibilityChain;

public abstract class Handler {
  protected Handler next;
  public void setnext(Handler _handler) {
    next = _handler;
  }
  public Handler getnext() {
    return next;
  }
  public abstract void operate(String ID);
}
