package workForce.commandExecutor;

import workForce.commandExecutor.commands.Command;


public interface Executor {

    void executeCommand(Command command) throws IllegalAccessException;
}
