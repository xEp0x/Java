package workForce.commandExecutor.commands;

import workForce.annotations.Inject;
import workForce.repositories.JobRepository;

public class StatusCommand extends BaseCommand {

    @Inject private JobRepository repository;

    public StatusCommand(String[] data) {
        super(data);
    }

    @Override
    public void execute() {
        System.out.println(repository.toString());
    }
}
