public class App {
    public static void main(String[] args) {
        Shape shape1 = new Circle(49);
        System.out.println((int)shape1.area());

        Shape shape2 = new Square(12);
        System.out.println(shape2.area());
    }
}
