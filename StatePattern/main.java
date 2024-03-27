package StatePattern;

public class main {
  public static void main(String[] args) {
    NetworkState state1 = new OpenState();
    NetworkState state2 = new ConnectState();
    NetworkState state3 = new CloseState();
    state2.next = state3;
    state1.next = state2;

    NetworkProcessor process = new NetworkProcessor(state1);

    process.Operation1();
    process.Operation2();
    process.Operation3();
  }
}
