public class StudentBuilder {
    private int rollNo;
    private String name;
    private String phoneNumber;
    private int age;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student students() {
        return new Student(rollNo, name, phoneNumber, age);
    }
    
}
