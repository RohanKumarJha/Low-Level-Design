public class Student {
    private int rollNo;
    private String name;
    private String phoneNumber;
    private int age;

    public Student(int rollNo, String name, String phoneNumber, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
    }


}
