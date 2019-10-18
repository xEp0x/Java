package commandInterpreter.commands;

import annotations.Alias;
import annotations.Inject;
import models.BlobsRepository;


@Alias(value = "pass")
public class PassCommand extends Command {

    @Inject private BlobsRepository repository;

    public PassCommand(String[] data) {
        super(data);
    }

    @Override
    public void execute() {
        this.repository.update();
    }
}
