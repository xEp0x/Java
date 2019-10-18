package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Alias;
import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;


@Alias("report")
public class ReportCommand extends Command {

    @Inject private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String output = this.repository.getStatistics();
        return output;
    }
}
