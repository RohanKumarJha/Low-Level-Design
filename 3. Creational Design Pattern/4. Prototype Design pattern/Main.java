public class Main {
    public static void main(String[] args) {
        StudentInterface obj1 = new Student(101, "Rohan", "AI");
        StudentInterface obj2 = new Student(102, "Rishabh", "ML");
        StudentInterface obj3 = new Student(103, "Ajay", "Data Scientist");
        StudentInterface obj = obj3.clone();
        System.out.println(obj);
    }
}
