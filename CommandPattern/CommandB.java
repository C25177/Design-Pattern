package CommandPattern;

public class CommandB implements Command {
  private SubjectB B;
  
  public CommandB (SubjectB _B) {
    B = _B;
  }
  
  @Override
  public void execute() {
    B.operateB();
  }
}
