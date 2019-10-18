package commandInterpreter.commands;

import annotations.Alias;
import annotations.Inject;
import models.BlobsRepository;


@Alias(value = "report-events")
public class ReportEventsCommand extends Command {

    @Inject private BlobsRepository repository;

    public ReportEventsCommand(String[] data) {
        super(data);
    }

    @Override
    public void execute() {
        this.repository.triggerReportEvents();
    }
}
