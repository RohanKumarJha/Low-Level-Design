public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(4);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Area of Rectangle: " + areaCalculator.calculateRectangleArea(rectangle));
        System.out.println("Area of Circle: " + areaCalculator.calculateCircleArea(circle));
    }
}