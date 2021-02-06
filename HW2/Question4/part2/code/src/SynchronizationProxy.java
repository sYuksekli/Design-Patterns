/**
 * This class is a synchronization proxy
 * It provides capability of synchronization when a client make a request
 */
public class SynchronizationProxy implements ITable {

    /**
     * Represents the data base table
     */
    private DataBaseTable table;

    /**
     * Constructor to initialize field
     * @param _table represents the data base table
     */
    public SynchronizationProxy(DataBaseTable _table) {
        this.table = _table;
    }

    /**
     * This method gets the element held in a given cell
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @return Object which is held in given cell
     */
    @Override
    public Object getElementAt(int row, int column) {
        // Take Lock
        synchronized (this) {
            System.out.print("\nThe data at the [" + row + "][" + column + "] is read which is " + table.getElementAt(row,column) + " ");
            return table.getElementAt(row,column);
        }
    }

    /**
     * This method sets the element at the given location
     * @param row corresponds to a row in database table
     * @param column corresponds to a column in database table
     * @param o is the data that will be written
     */
    @Override
    public void setElementAt(int row, int column, Object o) {
        // Take Lock
        synchronized (this) {
            System.out.print("\nNew value " + o + " was written to ["+  row + "][" + column + "]" + "location ");
            table.setElementAt(row,column,o);
        }
    }

    /**
     * Returns the total number of rows
     * @return number of rows
     */
    @Override
    public int getNumberOfRows() {
        return table.getNumberOfRows();
    }

    /**
     * Returns the total number of columns
     * @return number of columns
     */
    @Override
    public int getNumberOfColumns() {
        return table.getNumberOfColumns();
    }
}
