package BridgeMode;

public abstract class ShapeBase {
  protected ColorBase color;
  public void addColor(ColorBase _color) {
    color = _color;
  }
  public abstract void show();
}
