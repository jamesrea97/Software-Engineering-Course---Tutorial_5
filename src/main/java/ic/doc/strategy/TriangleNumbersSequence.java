package ic.doc.strategy;

public class TriangleNumbersSequence implements DiscreteSequence {

  @Override
  public int termSpecific(int i) {
    if (i < 1) {
      return 1;
    }
    return (i + 1) * (i + 2) / 2;
  }
}
