public class Main {
    public static void main(String[] args) {
        StudentBuilder obj = new StudentBuilder();
        obj.setRollNo(101);
        obj.setAge(26);
        obj.setName("Rohan");

        System.out.println(obj.students());
    }
}
