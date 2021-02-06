/**
 * This class represents the alter command.
 * This command was defined as adding a new information column about customers to the list.
 */
public class Alter implements Command {


    /**
     * It indicates the list of information about customers
     */
    String [][] tableOfBankCustomers;

    /**
     * It indicates the new information to be added.
     */
    private String newCol;


    /**
     * Constructor to initialize table that holds information of customers
     * @param table indicates the list of the customers
     * @param _newCol indicates the new information column to be added
     */
    public Alter(String [][] table, String _newCol) {
        this.tableOfBankCustomers = table;
        this.newCol = _newCol;
    }

    /**
     * This method carries out the aim of the command
     * It adds a new column to the list
     */
    @Override
    public void execute() {

        int row = tableOfBankCustomers.length;
        int col = tableOfBankCustomers[0].length;

        // List is resized
        String [][] temp = tableOfBankCustomers;
        tableOfBankCustomers = new String[row][col+1];

        // Contents are assigned
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                tableOfBankCustomers[i][j] = temp[i][j];
            }
        }

        for (int i = 0; i < tableOfBankCustomers.length; i++) {
                tableOfBankCustomers[i][tableOfBankCustomers.length-1] = "xxx";
        }

        System.out.println("Alter command is executed to add a column to table");
        System.out.println(newCol  + " information of customers is added to the table");
    }

    /**
     * This method undoes the action that the command did.
     * It deletes the last column that is added
     */
    @Override
    public void undo() {

        System.out.println("Alter command is undid and it deleted last column from table");

        for (int i = 0; i < tableOfBankCustomers.length; i++) {
            tableOfBankCustomers[i][tableOfBankCustomers.length+1] = "";
        }
    }
}
