package MementoPattern;

public class Robot {
  private State state;

  public Robot() {
    state = new State(0, 0, 0);
  }

  public void restore(Memento _memento) {
    state = _memento.state;
  }
  
  public Memento setMemento() {
    return new Memento(state);
  }

  public State getstate ()  {
    return state;
  }
  
  public void setstate (State _state) {
    state = _state;
  }

  public void show() {
    System.out.println(state.toString());
  }
}
