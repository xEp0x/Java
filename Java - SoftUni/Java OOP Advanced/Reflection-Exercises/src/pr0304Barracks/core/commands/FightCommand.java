package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Alias;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;


@Alias("fight")
public class FightCommand extends Command {

    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return "fight";
    }
}
