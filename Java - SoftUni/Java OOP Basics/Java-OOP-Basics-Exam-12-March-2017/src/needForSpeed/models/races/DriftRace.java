package needForSpeed.models.races;



public class DriftRace extends Race {

    public DriftRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public void calculateParticipantsPerformancePoints() {
        super.getParticipants().forEach(c -> c.setPerformancePoints(c.getSuspensionPerformance()));
    }
}
