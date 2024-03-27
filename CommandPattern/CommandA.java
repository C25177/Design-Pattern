package CommandPattern;

public class CommandA implements Command{
  private SubjectA A;

  public CommandA (SubjectA _A) {
    A = _A;
  }
  @Override
  public void execute() {
    A.operateA();
  }
}
