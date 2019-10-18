package workForce.commandExecutor.commands;


public abstract class BaseCommand implements Command {

    private String[] data;

    protected BaseCommand(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
}
