public class AbstractFactoryClass implements AbstractFactory {

    private Shape shape;
    private Color color;

    @Override
    public void display(String str1, String str2) {
        shape = getShape(str1);
        color = getColor(str2);

        if (shape != null) {
            shape.show();
        } else {
            System.out.println("Invalid Shape!");
        }

        if (color != null) {
            color.show();
        } else {
            System.out.println("Invalid Color!");
        }
    }

    private Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }

    private Color getColor(String colorType) {
        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        return null;
    }
}
