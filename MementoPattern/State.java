package MementoPattern;

public class State {
  private float x;
  private float v;
  private int runtime;
  public State(int _runtime, float _x, float _v) {
    runtime = _runtime;
    x = _x;
    v = _v;
  }
  @Override
  public String toString() {
    return "runtime:" + runtime + "\t" + "x:" + x + "\t" + "v:" + v;
  }
}
