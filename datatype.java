import java.util.Vector;

public class datatype {
  public static void main(String[] args){
    int a = 1;
    String s = "hello";
    char c = 'c';
    double d = 1.133;
    float f = 1.2f;
    long l = 1234567890;
    boolean b = true;
    final int fi = 10;
    // fi = 1;
    System.out.println(a);
    System.out.println(s);
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);
    System.out.println(l);
    System.out.println(b);
    System.out.println(fi);
    String s1 = s.substring(1, 2);
    System.out.println(s1);
    Vector A = new Vector();
    A.add(1);
    System.out.println(A.elementAt(0));
    
    bark();
  }
  public static void bark(){
    System.out.println("ww");
  }
}
