package ObserverMethod;

public class SubjectA extends AbstractSubject{
  @Override
  public void notifyObserver() {
    System.out.println("subject A notify");
    for (AbstractObserver obs: observers) {
      obs.response();
    }
  }
}
