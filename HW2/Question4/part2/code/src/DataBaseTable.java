import java.util.Random;

/**
 * This class represents the data base table
 */
public class DataBaseTable implements ITable{

    /**
     * Represents the data base table
     */
    private Object[][] table;

    /**
     * Constructor to initialize field
     * @param numOfRow represents the number of rows that the database will have
     * @param numOfCol represents the number of columns that the database will have
     */
    public DataBaseTable(int numOfRow, int numOfCol) {
        table = new Object[numOfRow][numOfCol];

        // Fill the table with random integer numbers
        Random random;
        int num;
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfCol; j++) {
                random = new Random();
                num = random.nextInt(50);
                table[i][j] = num;
            }
        }
    }

    /**
     * This method gets the element held in a given cell
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @return Object which is held in given cell
     */
    @Override
    public Object getElementAt(int row, int column) {
        return table[row][column];
    }

    /**
     * This method sets the element at the given location
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @param o is the data that will be written
     */
    @Override
    public void setElementAt(int row, int column, Object o) {
        table[row][column] = o;
    }

    /**
     * Returns the total number of rows
     * @return number of rows
     */
    @Override
    public int getNumberOfRows() {
        return table.length;
    }

    /**
     * Returns the total number of columns
     * @return number of columns
     */
    @Override
    public int getNumberOfColumns() {
        return table[0].length;
    }

    /**
     * Return a string that defines the object
     * @return String
     */
    @Override
    public String toString() {

        String s = "";
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                s += table[i][j] + " ";
            }
            s+= "\n";
        }
        return String.format("Table : \n" + s);
    }
}
