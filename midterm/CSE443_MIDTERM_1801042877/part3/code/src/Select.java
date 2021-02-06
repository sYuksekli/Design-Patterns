/**
 * This class represents the select command.
 * For the sake of the simplicity, this command was defined as selecting a customer from the list.
 */
public class Select implements Command{


    /**
     * It indicates the list of information about customers
     */
    private String [][] tableOfBankCustomers;

    /**
     * It indicates the customer number
     */
    private  int customerNo;

    /**
     * Constructor to initialize table that holds information of customers
     * @param table indicates the list of the customers
     * @param customer_no indicates the number of the customer
     */
    public Select(String [][] table, int customer_no) {
        this.tableOfBankCustomers = table;
        this.customerNo = customer_no;
    }

    /**
     * This method carries out the aim of the command
     * It just prints the information message to show that the select command works
     */
    @Override
    public void execute() {
        System.out.println("The customer with ID " + customerNo + " was selected.");
    }

    /**
     * This method undoes the action that the command did.
     * It just prints the information message to show that the select command is undid.
     */
    @Override
    public void undo() {
        System.out.println("The selection process of the customer with ID " + customerNo + " has been undone.");
    }

}
