package StrategyMethod;

public class Context {
  private AbstractStrategy strategy;
  public AbstractStrategy getStrategy() {
    return strategy;
  }
  public void setStrategy(AbstractStrategy _strategy) {
    strategy = _strategy;
  }
  public void runStrategy() {
    strategy.run();
  }
}
