/**
 * This class represents a type of data that belongs to Gokturk3 satellite.
 */
public class DataType1 implements DataOfGokturk3 {

    /**
     * Represents the data of the satellite
     */
    private int data[][];

    /**
     * Constructor to initialize data of the satellite
     * @param _data represents the data of satellite
     */
    public DataType1(int _data[][]) {
        this.data = _data;
    }

    /**
     * This method creates the iterator that will travers through data
     * @return DataIterator to iterate through data
     */
    @Override
    public DataIterator createIterator() {
        return new SpirallyAntiClockwiseIterator(data);
    }
}
