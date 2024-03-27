package MementoPattern;

public class main {
  public static void main(String[] args) {
    Robot robot = new Robot();
    robot.show();
    Manager manager = new Manager();
    State state1 = new State(1, 1, 2);
    robot.setstate(state1);
    robot.show();
    Memento memento = robot.setMemento();
    manager.storeMemento(memento);
    State state2 = new State(2, 3, 3);
    robot.setstate(state2);
    robot.show();
    robot.restore(memento);
    robot.show();
  }
}
