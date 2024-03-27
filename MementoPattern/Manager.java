package MementoPattern;

public class Manager {
  private Memento memento;
  public void storeMemento(Memento _memento) {
    memento = _memento;
  }
  public Memento getMemento() {
    return memento;
  }
}
