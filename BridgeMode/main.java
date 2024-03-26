package BridgeMode;

public class main {
  public static void main(String[] args) {
    ColorBase blue = new ColorBlue();
    ColorBase red = new ColorRed();
    ShapeBase circle = new ShapeCircle();
    ShapeRectangle rectangle = new ShapeRectangle();

    circle.addColor(red);
    rectangle.addColor(blue);

    circle.show();
    rectangle.show();
  }
}
