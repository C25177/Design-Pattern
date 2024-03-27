package BuilderMode;

import java.util.concurrent.CompletableFuture;

public class Compute {
  private String CPU;
  private String RAM;
  private int usbCount;
  private String keyboard;
  private String display;

  private Compute(Builder _builder) {
    this.CPU = _builder.CPU;
    this.RAM = _builder.RAM;
    this.usbCount = _builder.usbCount;
    this.keyboard = _builder.keyboard;
    this.display = _builder.display;
  }

  public static class Builder {
    private String CPU;
    private String RAM;
    private int usbCount;
    private String keyboard;
    private String display;

    public Builder(String _CPU, String _RAM) {
      this.CPU = _CPU;
      this.RAM = _RAM;
    }

    public Builder setUsbCount(int _usbCount) {
      this.usbCount = _usbCount;
      return this;
    }

    public Builder setKeyBoard(String _keyboard) {
      this.keyboard = _keyboard;
      return this;
    }

    public Builder setDisplay(String _display) {
      this.display = _display;
      return this;
    }

    public Compute build() {
      return new Compute(this);
    }
  }

  public void show() {
    System.out.println(CPU);
    System.out.println(RAM);
    System.out.println(usbCount);
    System.out.println(keyboard);
    System.out.println(display);
  }
}
