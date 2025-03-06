public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Rohan", "9868935962");
        Student student2 = (Student) student1.clone();
        System.out.println(student2.StudentId+", "+student2.StudentName+", "+student2.PhoneNumber);
    }
}
