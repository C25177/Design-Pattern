package InterpreterPattern;

import java.util.HashMap;

public abstract class SymbolExpression{
  Expression left;
  Expression right;

  public SymbolExpression(Expression _left, Expression _right) {
    left = _left;
    right = _right;
  }
}
