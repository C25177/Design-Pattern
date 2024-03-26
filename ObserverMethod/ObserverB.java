package ObserverMethod;

public class ObserverB implements AbstractObserver {
  @Override
  public void response() {
    System.out.println("ObserverB response");
  } 
}
