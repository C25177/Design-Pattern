package IteratorPattern;

public class IntContain implements Contain<Integer> {
  private int[] ids = {1, 2, 3, 4, 5, 6};
  Iterator<Integer> iterator = new IntegerIterator();

  @Override
  public Iterator<Integer> getIterator() {
    return iterator;
  }

  private class IntegerIterator implements Iterator<Integer> {
    int index = 0;

    @Override
    public Integer first() {
      return ids[0];
    }
    
    @Override
    public Integer next() {
      return ids[index++];
    }
    
    @Override
    public boolean isDone() {
      if(index < ids.length) return false;
      return true;
    }
    
    @Override
    public Integer current() {
      return ids[index];
    }

  }
}
