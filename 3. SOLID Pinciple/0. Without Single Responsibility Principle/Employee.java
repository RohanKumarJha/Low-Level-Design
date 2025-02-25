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

    public void ShowData() {
        System.out.println("Employee Id : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Stream : "+Salary);
    }

    public int annualPacakge() {
        return 12*Salary;
    }

    public void saveToDB() {
        System.out.println("Save to DataBase...");
    }
    
}