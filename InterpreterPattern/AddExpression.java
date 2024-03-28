package InterpreterPattern;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

  public AddExpression(Expression _left, Expression _right) {
    left = _left;
    right = _right;
  }
  @Override
  public int interpreter(HashMap<Character, Integer> _map) {
    return left.interpreter(_map) + right.interpreter(_map);
  }
}
