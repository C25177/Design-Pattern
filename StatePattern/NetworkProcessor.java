package StatePattern;

public class NetworkProcessor {
  NetworkState state;
  public NetworkProcessor(NetworkState _state) {
    state = _state;
  }

  public void Operation1() {
    state.Operation1();
    state = state.next;
  }
  
  public void Operation2() {
    state.Operation2();
    state = state.next;
  }
  
  public void Operation3() {
    state.Operation3();
    state = state.next;
  }
}
