package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {

  private final DiscreteSequence sequence;

  public Sequence(DiscreteSequence s) {
    sequence = s;
  }

  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return sequence.termSpecific(i);
  }

  @Override
  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }
}
