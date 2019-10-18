package companyHierarchy;

public class Department {

    private String name;

    public Department(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 3 || (!name.equals("Production") && !name.equals("Accounting") &&
        !name.equals("Sales") && !name.equals("Marketing"))) {
            throw new IllegalArgumentException("Invalid input!");
        }

        this.name = name;
    }
}
