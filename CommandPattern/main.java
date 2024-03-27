package CommandPattern;

public class main {
  public static void main(String[] args) {
    SubjectA A = new SubjectA();
    SubjectB B = new SubjectB();
    Command comA = new CommandA(A);
    Command comB = new CommandB(B);

    Manager man = new Manager();
    man.addCommand(comA);
    man.addCommand(comB);
    man.addCommand(comA);

    man.Run();
  }
}
