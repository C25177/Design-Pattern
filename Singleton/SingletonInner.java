package Singleton;

public class SingletonInner {
  private static class SingletonHodler {
    private static SingletonInner instance = new SingletonInner();
  }
  private SingletonInner() {

  }
  public static SingletonInner getInstance() {
    return SingletonHodler.instance;
  }
  public void show() {
    System.out.println("instance Inner");
  }
}
