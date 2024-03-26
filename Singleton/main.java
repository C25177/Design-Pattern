package Singleton;

public class main {
  public static void main(String[] args) {
    Singleton.getInstance().show();
    SingletonInner.getInstance().show();
  }
}
