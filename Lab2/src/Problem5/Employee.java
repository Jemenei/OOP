package Problem5;

public class Employee extends Person {
    private String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }
}
