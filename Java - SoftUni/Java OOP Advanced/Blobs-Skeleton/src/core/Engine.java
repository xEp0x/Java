package core;

import commandInterpreter.CommandInterpreter;
import factories.AttackFactory;
import factories.BehaviorFactory;
import interfaces.InputReader;
import io.ConsoleInputReader;
import io.ConsoleOutputWriter;
import models.BlobsRepository;

import java.lang.reflect.InvocationTargetException;

public class Engine {

    private InputReader inputReader;
    private CommandInterpreter commandInterpreter;

    public Engine() {
        this.inputReader = new ConsoleInputReader();
        this.commandInterpreter = new CommandInterpreter(
                new ConsoleOutputWriter(),
                new AttackFactory(),
                new BehaviorFactory(),
                new BlobsRepository());
    }

    public void run() {
        String command;

        while (!"drop".equals(command = this.inputReader.readLine())) {

            try {
                this.commandInterpreter.interpretCommand(command);
            } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
                e.printStackTrace();
            }

        }
    }
}
