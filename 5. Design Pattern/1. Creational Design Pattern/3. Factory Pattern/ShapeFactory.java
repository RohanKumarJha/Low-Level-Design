public class ShapeFactory {
    
    public static Shape Shapes(String str) {
        if(str.trim().toLowerCase().equals("Circle")) {
            return new Circle();
        } else if(str.trim().toLowerCase().equals("Square")) {
            return new Square();
        } else if(str.trim().toLowerCase().equals("Rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
