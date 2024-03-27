package FlyweightMode;

public class Device {
  public int id;
  public boolean using;
  public Device(int _id) {
    this.id = _id;
    this.using = false;
  }
  public void run() {
    System.out.println(id + "run");
  }
}
