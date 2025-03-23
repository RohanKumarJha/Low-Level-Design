public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rohan", 25000);
        PrintData printData = new PrintData();
        printData.ShowData(emp);
        AnnualSalary annualSalary = new AnnualSalary();
        System.out.println("Annual salary is "+annualSalary.annualSalary(emp));
        SaveTODB saveTODB = new SaveTODB();
        saveTODB.saveToDb(emp);
    }
}
