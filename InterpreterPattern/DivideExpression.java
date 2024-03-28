package InterpreterPattern;

import java.util.HashMap;

public class DivideExpression extends SymbolExpression {
  public DivideExpression(Expression _left, Expression _right) {
    left = _left;
    right = _right;
  }
  @Override
  public int interpreter(HashMap<Character, Integer> _map) {
    return left.interpreter(_map) - right.interpreter(_map);
  } 
}
