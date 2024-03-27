package ProxyMode;

public class DeviceProxy {
  Device d = new Device();
  public void TurnOn() {
    System.out.println("proxy encord begin");
    d.TurnOn();
  }
  public void TurnOff() {
    d.TurnOff();
    System.out.println("proxy encord end");
  }
}
