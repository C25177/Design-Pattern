package InterpreterPattern;

import java.util.HashMap;

public class AddExpression implements Expression extends SymbolExpression {

  public AddExpression(Expression _left, Expression _right) {
    super(_left, _right);
  }
  @Override
  public int interpreter(HashMap<Character, Integer> _map) {

  }
}
