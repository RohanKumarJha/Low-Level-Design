public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"Rohan",25000);
        emp.ShowData();
        System.out.println("Annual Salary is "+emp.annualPacakge());
        emp.saveToDB();
    }
}