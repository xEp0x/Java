package p04_recharge_with_adapter;


public class RobotAdapter implements Rechargeable {

    private Robot robot;
    private int currentPower;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void recharge() {
        this.currentPower += 123;
    }
}
