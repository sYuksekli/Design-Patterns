/**
 * This class represents an iterator that will traverse through the data counterclockwise.
 */
public class SpirallyAntiClockwiseIterator implements DataIterator {

    /**
     * Represents the data of the satellite
     */
    private final int [] data;

    /**
     * Represents the last place where the iterator was left.
     */
    private int position;


    /**
     * Constructor to initialize data field
     * @param _data represents the data of the satellite
     */
    public SpirallyAntiClockwiseIterator(int [][] _data) {

        // Initially iterator shows the beginning of the array
        position = 0;

        int numOfRow = _data.length;
        int numOfCol = _data[0].length;

        // row and col values are going to be changed
        // That's way I have back-up variables that are numOfRow and numOfCol
        int row = numOfRow;
        int col = numOfCol;

        // To make iterator operations easily, I convert 2D data array to one dimensional array.
        // Elements in 1D data array arranged in anticlockwise order.
        data = new int[numOfRow * numOfCol];
        // index of the one dimensional data array
        int data_index = 0;

        // These are the positions to traverse counterclockwise correctly.
        int col_position = 0, row_position = 0;
        // This variable controls whether all the element has been processed or not
        int count = 0;

        // Continue until all the elements in the array are processed
        while (count != numOfRow * numOfCol) {

            // There are 4 situations in total. These are respectively:
            // 1.Going down , 2. Going right , 3. Going Up , 4. Going left
            // So, there are four loops
            // After every loop, termination condition must be checked, because
            // it can enter another loop, until it reaches the while loop
            if (count != numOfRow * numOfCol) {
                for (int i = row_position; i < row; ++i) {
                    data[data_index] = _data[i][col_position];
                    ++data_index;
                    ++count;
                }
                ++col_position;
            }

            if (count != numOfRow * numOfCol) {
                for (int i = col_position; i < col; i++) {
                    data[data_index] = _data[row - 1][i];
                    ++data_index;
                    ++count;
                }
                --row;
            }

            if (row_position < row && count != numOfRow * numOfCol) {
                for (int i = row -1; i >= row_position ; i--) {
                    data[data_index] = _data[i][col-1];
                    ++ data_index;
                    ++count;
                }
                -- col;
            }

            if (col_position < col && count != numOfRow * numOfCol) {
                for (int i = col -1; i >= col_position ; i--) {
                    data[data_index] = _data[row_position][i];
                    ++ data_index;
                    ++count;
                }
                ++ row_position;
            }
        }
    }

    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements.
     */
    @Override
    public boolean hasNext() {
        return position < data.length;
    }

    /**
     * Returns the next element in the iteration.
     * @return Object which is the next element in the iteration
     */
    @Override
    public Object next() {

        int element = data[position];
        ++ position;
        return element;
    }
}
