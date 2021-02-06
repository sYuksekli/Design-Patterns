/**
 * This class behaves like a command that does nothing.
 * It is used for getting rid of checking a command is null every time
 */
public class NoCommand implements Command {

    /**
     * This method carries out the aim of the command
     */
    @Override
    public void execute() { }


    /**
     * This method undoes the action that the command did.
     */
    @Override
    public void undo() { }
}
