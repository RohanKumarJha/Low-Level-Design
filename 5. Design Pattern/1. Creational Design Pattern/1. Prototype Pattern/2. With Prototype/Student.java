class Student implements Prototype {
    int StudentId;
    String StudentName;
    String PhoneNumber;

    Student(int StudentId,String StudentName,String PhoneNumber) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public Prototype clone() {
        return new Student(StudentId, StudentName, PhoneNumber);
    }
}