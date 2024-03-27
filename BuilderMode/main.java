package BuilderMode;

public class main {
  public static void main(String[] args) {
    Compute c = new Compute.Builder("cpu", "ram").setDisplay("display").setKeyBoard("keyboard").setUsbCount(5).build();
    c.show();
  }
}
