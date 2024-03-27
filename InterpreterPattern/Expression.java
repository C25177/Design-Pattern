package InterpreterPattern;

import java.util.HashMap;

public interface Expression {
  public int interpreter(HashMap<Character, Integer> var);
}
