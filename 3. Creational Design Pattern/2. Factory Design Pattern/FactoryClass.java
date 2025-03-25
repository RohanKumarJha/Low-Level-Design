public class FactoryClass implements Factory {

    private Shape shape;

    @Override
    public void display(String str) {
        if(str.equalsIgnoreCase("Circle")) {
            shape = new Circle();
            shape.show();
        } else if(str.equalsIgnoreCase("Square")) {
            shape = new Square();
            shape.show();
        } else {
            System.out.println("Invalid Choice...");
        }
    }
    
}
