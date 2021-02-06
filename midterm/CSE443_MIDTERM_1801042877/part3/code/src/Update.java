/**
 * This class represents the update command.
 * This command was defined as updating n information of a customer from the list.
 */
public class Update implements Command{


    /**
     * It indicates the list of information about customers
     */
    private String [][] tableOfBankCustomers;

    /**
     * It indicates the customer number
     */
    private int customerNo;

    /**
     * It indicates the part of the list that will be updated
     */
    private int col;

    /**
     * It indicates the new information that will be written
     */
    private String update;

    /**
     * It indicates the last information when an update occurs.
     */
    private String previousInfo;


    /**
     * Constructor to initialize table that holds information of customers
     * @param table indicates the list of the customers
     * @param customer_no indicates the number of the customer
     * @param _col indicates the part of the list that will be updated
     * @param newInfo indicates the new information to replace the old one.
     */
    public Update(String [][] table, int customer_no, int _col, String newInfo) {

        this.tableOfBankCustomers = table;
        this.customerNo = customer_no;
        this.col = _col;
        this.update = newInfo;
    }

    /**
     * This method carries out the aim of the command
     * It prints the information of the customer after the table was updated.
     */
    @Override
    public void execute() {

        previousInfo = tableOfBankCustomers[customerNo][col];
        tableOfBankCustomers[customerNo][col] = update;

        System.out.println("Information of the customer with ID " + customerNo + " was updated.");
        System.out.println("Customer information are : ");
        for (int i = 0; i < tableOfBankCustomers[customerNo].length; i++)
            System.out.println( "-" + tableOfBankCustomers[customerNo][i]);
    }


    /**
     * This method undoes the action that the command did.
     * Update process is canceled and prints the customer's information
     */
    @Override
    public void undo() {

        tableOfBankCustomers[customerNo][col] = previousInfo;

        System.out.println("Last Update has been undone. Information of the customer with ID " + customerNo + " is :");
        System.out.println("Customer information are : ");
        for (int i = 0; i < tableOfBankCustomers[customerNo].length; i++)
            System.out.println( "-" + tableOfBankCustomers[customerNo][i]);
    }

}
