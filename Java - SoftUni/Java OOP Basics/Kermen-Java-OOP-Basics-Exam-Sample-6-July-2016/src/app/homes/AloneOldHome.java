package app.homes;

import app.Room;
import app.people.Person;

public class AloneOldHome extends Home {

    private static final int ROOMS_COUNT = 1;
    private static final int ROOMS_CONSUMPTION = 15;

    public AloneOldHome(Person person) {
        this.people.add(person);
    }

    @Override
    public void addRooms() {
        this.addRooms(ROOMS_COUNT, ROOMS_CONSUMPTION);
    }
}
