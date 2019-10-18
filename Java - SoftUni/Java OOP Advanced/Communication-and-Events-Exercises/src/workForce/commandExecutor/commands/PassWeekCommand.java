package workForce.commandExecutor.commands;

import workForce.annotations.Inject;
import workForce.repositories.JobRepository;


public class PassWeekCommand extends BaseCommand {

    @Inject private JobRepository repository;

    public PassWeekCommand(String[] data) {
        super(data);
    }

    @Override
    public void execute() {
        this.repository.update();
    }
}
