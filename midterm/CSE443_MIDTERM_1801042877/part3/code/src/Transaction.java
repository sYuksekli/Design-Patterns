/**
 * This class performs the situation where multiple commands function at the same time.
 * For instance to achieve an operation, select and then update commands need to done.
 */
public class Transaction implements Command{

    /**
     * It holds the commands that will executed in order.
     */
    private Command [] commands;

    /**
     * Constructor to initialize commands
     * @param _commands hold the commands that will executed in order.
     */
    public Transaction(Command[] _commands) {
        this.commands = _commands;
    }


    /**
     * This method carries out the aim of the command
     * It call execute method of every command.
     */
    public void execute() {

        for (int i = 0; i < commands.length; ++i) {
            commands[i].execute();
        }
    }

    /**
     * This method undoes the action that the command did.
     * It call undo method of every command.
     */
    @Override
    public void undo() {

        for (int i = commands.length-1; i >= 0; --i) {
            commands[i].undo();
        }
    }
}
