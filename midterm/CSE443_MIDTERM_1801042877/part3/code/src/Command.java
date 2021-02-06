/**
 * This interface represents the commands
 */
public interface Command {

    /**
     * This method carries out the aim of the command
     */
     void execute();

    /**
     * This method undoes the action that the command did.
     */
     void undo();
}
