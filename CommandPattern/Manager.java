package CommandPattern;

import java.util.ArrayList;

public class Manager {
  private final ArrayList<Command> commands = new ArrayList<Command>();

  public void addCommand(Command _command) {
    commands.add(_command);
  }
  public void removeCommand(Command _command) {
    commands.remove(_command);
  }
  public void clearCommand() {
    commands.clear();
  }
  public void Run() {
    for(Command com : commands) {
      com.execute();
    }
  }
}
