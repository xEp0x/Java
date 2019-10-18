package pawIncExercises.models.centers;

import pawIncExercises.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CastrationCenter extends Center {

    public CastrationCenter(String name) {
        super(name);
    }

    public List<Animal> castrate() {
        List<Animal> castrated = new ArrayList<>(super.getAnimals());
        super.removeAnimals(castrated);
        return castrated;
    }
}
