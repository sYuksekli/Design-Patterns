/**
 * Driver class for testing
 */
public class Main {

    public static void main(String[] args) {

        // I created an imaginary table that holds the customer information
        // like name of the customer, address of customer  and total assets in the bank
        String [][] tableOfBankCustomers = new String[4][3];

        tableOfBankCustomers[0][0] = "John Evidence";
        tableOfBankCustomers[0][1] = "Address1";
        tableOfBankCustomers[0][2] = "$1000";

        tableOfBankCustomers[1][0] = "Maria Keen";
        tableOfBankCustomers[1][1] = "Address2";
        tableOfBankCustomers[1][2] = "$2000";

        tableOfBankCustomers[2][0] = "Tom Cooper";
        tableOfBankCustomers[2][1] = "Address3";
        tableOfBankCustomers[2][2] = "$3000";

        tableOfBankCustomers[3][0] = "Effy Rose";
        tableOfBankCustomers[3][1] = "Address4";
        tableOfBankCustomers[3][2] = "$4000";


        // Create depositMoneyInBank objects to invoke commands
        depositMoneyInBank depositMoney = new depositMoneyInBank();
        depositMoneyInBank depositMoney2 = new depositMoneyInBank();

        // Created different types of command objects to test program
        Select selectCommand = new Select(tableOfBankCustomers,1);
        Update updateCommand = new Update(tableOfBankCustomers,1,2,Integer.toString(5000));
        Alter alterCommand = new Alter(tableOfBankCustomers,"e-mail");

        Command[] commands = new Command[2];
        commands[0] = selectCommand;
        commands[1] = updateCommand;
        Transaction transaction = new Transaction(commands);

        // Deposit the money
        System.out.println(" - - - - - - - - TEST 1 - - - - - - - - - - ");
        depositMoney.set(0,transaction);
        depositMoney.DepositMoneyInBank();

        // Add new info to the list
        System.out.println();
        System.out.println(" - - - - - - - - TEST 2 - - - - - - - - - - ");
        alterCommand.execute();

        // This test shows the behavior of the program in case of an error
        System.out.println();
        System.out.println(" - - - - - - - - TEST 3 - - - - - - - - - - ");
        depositMoney.cancelOperation();

        // Test for second depositMoney2 object with different commands
        System.out.println();
        System.out.println(" - - - - - - - - TEST 4 - - - - - - - - - - ");
        Select selectCommand2 = new Select(tableOfBankCustomers,3);
        Update updateCommand2 = new Update(tableOfBankCustomers,3,2,Integer.toString(9000));
        depositMoney2.set(0,selectCommand2);
        depositMoney2.set(1,updateCommand2);
        depositMoney2.DepositMoneyInBank();

        // Test for error case for depositMoney2 object
        System.out.println();
        System.out.println(" - - - - - - - - TEST 4 - - - - - - - - - - ");
        depositMoney2.cancelOperation();

    }
}
