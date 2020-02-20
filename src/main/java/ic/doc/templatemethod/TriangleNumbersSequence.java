package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence {

  public int termSpecific(int i) {
    return (i + 1) * (i + 2) / 2;
  }
}
