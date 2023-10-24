public class test<T> {
  public static void main(String[] args){
    func(1);
    func('a');
    func(1.1 , 2, 2, 31);
  }
  public static void func(int a){
    System.out.println(a);
  }
  public static void func(char c){
    System.out.println(c);
  }
  public static void func(double...a){
    for(double d : a){
      System.out.println(d);
    }
  }
}
