package needForSpeed.models.races;


public class CasualRace extends Race {

    public CasualRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public void calculateParticipantsPerformancePoints() {
        super.getParticipants().forEach(c -> c.setPerformancePoints(c.getOverallPerformance()));
    }


}
