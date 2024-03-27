package MementoPattern;

public class Memento {
  State state;
  public Memento(State _state) {
    state = _state;
  }
  public State getstate() {
    return state;
  }
}
