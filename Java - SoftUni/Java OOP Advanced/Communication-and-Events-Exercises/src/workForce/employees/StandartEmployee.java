package workForce.employees;


public class StandartEmployee extends EmployeeAbstract {
    private static final int STANDARD_HOURS = 40;

    public StandartEmployee(String name) {
        super(name, STANDARD_HOURS);
    }
}
