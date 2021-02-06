/**
 * This class represents an iterator that will traverse through the data clockwise.
 * This class is not implemented, it is written to show dependencies.
 */
public class SpirallyClockwiseIterator implements DataIterator {

    /**
     * Represents the data of the satellite
     */
    private final int [] data;

    /**
     * Represents the last place where the iterator was left.
     */
    private int position;


    public SpirallyClockwiseIterator(int [][] _data) {
        position = 0;
        data = new int[_data.length*_data[0].length];

        /*
        // This are is empty
        // Does not need to implement clockwise algorithm
        //...
         */
    }

    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements.
     */
    @Override
    public boolean hasNext() {
        return false;
    }

    /**
     * Returns the next element in the iteration.
     * @return Object which is the next element in the iteration
     */
    @Override
    public Object next() {
        return null;
    }
}
