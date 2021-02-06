/**
 * This interface represents the general data base
 */
public interface ITable {

    /**
     * This method gets the element held in a given cell
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @return Object which is held in given cell
     */
    Object getElementAt(int row, int column);

    /**
     * This method sets the element at the given location
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @param o is the data that will be written
     */
    void setElementAt(int row, int column, Object o);

    /**
     * Returns the total number of rows
     * @return number of rows
     */
    int getNumberOfRows();

    /**
     * Returns the total number of columns
     * @return number of columns
     */
    int getNumberOfColumns();
}
