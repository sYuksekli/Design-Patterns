/**
 * This class represents an iterator that will traverse through the data.
 */
public interface DataIterator {

    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     * @return Object which is the next element in the iteration
     */
    Object next();
}
