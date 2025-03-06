class Student {
    int id;
    String name;

    static Student student;

    private Student() {

    }

    synchronized public static Student getObj() {
        if(student == null) {
            student = new Student();
        } return student;
    }
}