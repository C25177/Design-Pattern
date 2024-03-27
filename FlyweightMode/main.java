package FlyweightMode;

public class main {
  public static void main(String[] args) {
    Device device = DevicePool.getDevice();
    device.run();
  }
}
