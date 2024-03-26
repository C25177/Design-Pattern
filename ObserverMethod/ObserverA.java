package ObserverMethod;

public class ObserverA implements AbstractObserver{
  @Override
  public void response() {
    System.out.println("ObserverA response");
  }
}
