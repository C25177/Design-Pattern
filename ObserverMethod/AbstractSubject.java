package ObserverMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {
  protected List<AbstractObserver> observers = new ArrayList<AbstractObserver>();
  public void add(AbstractObserver _observer) {
    observers.add(_observer);
  }
  public void remove(AbstractObserver _observer) {
    observers.remove(_observer);
  }
  public abstract void notifyObserver();
}
