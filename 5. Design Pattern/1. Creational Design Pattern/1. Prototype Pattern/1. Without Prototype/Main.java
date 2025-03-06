public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Rohan", "9868935962");

        Student student2 = new Student();
        student2.StudentId = student1.StudentId;
        // student2.Name = student1.Name;
        student2.PhoneNumber = student1.PhoneNumber;

        // System.out.println(student2.StudentId+", "+student2.Name+", "+student2.PhoneNumber);
    }
}