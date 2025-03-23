public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("The area of circle is "+areaCalculator.calculateArea(circle1));
    }
}
