public class Employee {
    private int id;
    private String name;
    private int Salary;

    public Employee(int id, String name, int Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return Salary;
    }
}