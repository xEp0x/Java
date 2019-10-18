package hell.entities.commands;

import hell.entities.Repositories.Repository;
import hell.entities.annotations.Inject;
import hell.interfaces.Hero;

import java.lang.reflect.InvocationTargetException;


public class InspectCommand implements Executable {

    @Inject private String[] data;
    @Inject private Repository<Hero> heroRepository;

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String heroName = this.data[0];
        Hero hero = this.heroRepository.get(heroName);

        return hero.toString();
    }
}
