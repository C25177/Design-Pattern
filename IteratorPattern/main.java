package IteratorPattern;

public class main {
  public static void main(String[] args) {
    IntContain intContain = new IntContain();
    
    System.out.println(intContain.getIterator().first());
    System.out.println(intContain.getIterator().next());
    System.out.println(intContain.getIterator().current());
    System.out.println(intContain.getIterator().isDone());
    System.out.println(intContain.getIterator().next());
    System.out.println(intContain.getIterator().next());
  }
}
