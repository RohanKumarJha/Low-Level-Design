class Student {
    int id;
    String name;

    static Student student;

    private Student() {

    }

    public static Student getObj() {
        if(student == null) {
	    synchronize(Student.class) {
            	student = new Student();
	    }
        } return student;
    }
}