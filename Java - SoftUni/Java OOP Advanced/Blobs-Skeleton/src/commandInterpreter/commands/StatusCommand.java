package commandInterpreter.commands;

import annotations.Alias;
import annotations.Inject;
import models.BlobsRepository;
import interfaces.OutputWriter;


@Alias(value = "status")
public class StatusCommand extends Command {

    @Inject private BlobsRepository repository;
    @Inject private OutputWriter writer;

    public StatusCommand(String[] data) {
        super(data);
    }

    @Override
    public void execute() {
        this.writer.writeLine(this.repository.printStatus());
        this.repository.update();
    }
}
