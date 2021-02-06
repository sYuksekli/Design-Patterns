import java.util.Stack;

/**
 * This class represents a situation where some amount of money will be deposited in a bank.
 * I assume this operation can be done using select and update command.
 */
public class depositMoneyInBank {

    /**
     * To perform rollback a stack is held
     */
    private Stack<Command> storage;

    /**
     * This array holds the commands
     */
    private Command [] commands;


    /**
     * Constructor, it assigns commands to NoCommand object
     */
    public depositMoneyInBank() {

        commands = new Command[2];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            commands[i] = noCommand;
        }

        storage = new Stack<Command>();
    }

    /**
     * It adds the commands
     * @param slot indicates the current index
     * @param command indicates the command to be added
     */
    public void set(int slot, Command command) {
        commands[slot] =  command;
    }

    /**
     * This method deposit money in the bank
     */
    public void DepositMoneyInBank() {

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            storage.push(commands[i]);
        }
    }

    /**
     * If an error occurs it cancels the operation by undoing the commands.
     */
    public void cancelOperation() {

        System.out.println("Sorry, a problem occurred, deposit money operation is unsuccessful");
        System.out.println("Current information : ");
        while (!storage.isEmpty()) {
            Command command = storage.pop();
            command.undo();
        }
    }
}
