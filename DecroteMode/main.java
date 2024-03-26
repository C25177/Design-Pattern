package DecroteMode;

public class main {
  public static void main(String[] args) {
    Subject sub = new SubjectA();
    DecroteBase Asub = new DecroteA(sub);
    DecroteBase BAsub = new DecroteB(Asub);
    DecroteBase ABAsub = new DecroteA(BAsub);
    ABAsub.show();
  }
}
