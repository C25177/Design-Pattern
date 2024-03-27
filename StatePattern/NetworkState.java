package StatePattern;

public abstract class NetworkState {
  public NetworkState next;
  public abstract void Operation1();
  public abstract void Operation2();
  public abstract void Operation3();
}
