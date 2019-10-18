package workForce.employees;

public abstract class EmployeeAbstract implements Employee {

    private String name;
    private int workHoursPerWeek;

    protected EmployeeAbstract(String name, int workHoursPerWeek) {
        this.name = name;
        this.workHoursPerWeek = workHoursPerWeek;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWorkHoursPerWeek() {
        return this.workHoursPerWeek;
    }
}
