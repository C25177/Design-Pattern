package IteratorPattern;

public interface Iterator<T> {
  public T first();
  public T next();
  public boolean isDone();
  public T current();
}
