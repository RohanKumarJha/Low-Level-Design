public class Student {

    static Student student = new Student();

    int id;
    String name;

    private Student() {

    }

    public static Student getObj() {
        return student;
    }
}
