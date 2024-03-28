package InterpreterPattern;

import java.util.HashMap;
import java.util.HashSet;

public class main {
  public static void main(String[] args) {
    HashMap map = new HashMap<>();

    map.put('a', 1);
    map.put('b', 10);
    map.put('c', -5);
    
    Expression a = new VarExpression('a');
    Expression b = new VarExpression('b');
    Expression c = new VarExpression('c');

    Expression add = new AddExpression(a, b);
    Expression divide = new DivideExpression(add, c);

    System.out.println(divide.interpreter(map));
  }
}
