package hell.entities.interpreter;

import hell.entities.commands.Executable;


public interface Interpreter {

    Executable interpretCommand(String command) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
