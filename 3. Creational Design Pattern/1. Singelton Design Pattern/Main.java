public class Main {
    public static void main(String[] args) {
        Car obj = Car.getInstance();
        System.out.println(obj.hashCode());

        Car obj2 = Car.getInstance();
        System.out.println(obj2.hashCode());
    }
}