package ObserverMethod;

public class main {
  public static void main(String[] args) {
    AbstractSubject subject = new SubjectA();
    AbstractObserver obA = new ObserverA(); 
    AbstractObserver obB = new ObserverB(); 
    subject.add(obA);
    subject.add(obB);
    subject.notifyObserver();
  }
}
