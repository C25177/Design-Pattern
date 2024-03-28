package InterpreterPattern;

import java.util.HashMap;

public class VarExpression implements Expression {
  private char key;

  public VarExpression(char _key) {
    key = _key;
  }
  
  @Override
  public int interpreter(HashMap<Character, Integer> _map) {
    return _map.get(key);
  }
}
