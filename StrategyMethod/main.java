package StrategyMethod;

public class main {
  public static void main(String[] args) {
    Context context = new Context();
    AbstractStrategy strategyA = new ConcreteStrategyA();
    AbstractStrategy strategyB = new ConcreteStrategyB();
    context.setStrategy(strategyA);
    context.runStrategy();
    
    context.setStrategy(strategyB);
    context.runStrategy();
  }
}
