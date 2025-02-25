public class PrintData {
    public void ShowData(Employee emp) {
        System.err.println("Employee id "+emp.getId());
        System.out.println("Employee Name : "+emp.getName());
        System.out.println("Employee Salary : "+emp.getSalary());
    }
}
