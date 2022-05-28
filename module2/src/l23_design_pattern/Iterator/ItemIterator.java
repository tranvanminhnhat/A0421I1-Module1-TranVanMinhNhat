package l23_design_pattern.Iterator;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
