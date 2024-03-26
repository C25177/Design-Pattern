package DecroteMode;

public abstract class DecroteBase implements Subject{
  protected Subject base;
  public DecroteBase(Subject _base) {
    base = _base;
  }
  @Override
  public void show() {
    if(base!=null)
      base.show();
  }
}
