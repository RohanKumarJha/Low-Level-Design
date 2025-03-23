public class School {
    private String studentName;
    private String phoneNumber;
    private int rollNo;

    public School(String studentName, String phoneNumber) {
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
    }

    public School(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    public School(String studentName, String phoneNumber, int rollNo) {
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.rollNo = rollNo;
    }

    public void show() {
        System.out.println("StudentName : "+studentName+"; PhoneNumber : "+phoneNumber+"; Roll No : "+rollNo);
    }
    
}
