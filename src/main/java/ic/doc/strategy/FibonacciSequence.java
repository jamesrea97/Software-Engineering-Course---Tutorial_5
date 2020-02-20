package ic.doc.strategy;

public class FibonacciSequence implements DiscreteSequence {

  @Override
  public int termSpecific(int i) {
    if (i < 2) {
      return 1;
    }
    return termSpecific(i - 1) + termSpecific(i - 2);
  }
}
