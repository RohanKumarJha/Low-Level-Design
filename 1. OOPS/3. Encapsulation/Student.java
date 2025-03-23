public class Student {
    private String StudentName;
    private int rollNo;
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void show() {
        System.out.println("Student Name is : "+getStudentName()+", roll No is : "+getRollNo());
    }

}
