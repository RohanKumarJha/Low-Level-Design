public class Circle {

    // attributes
    private int RADIUS;

    Circle(int RADIUS) {
        this.RADIUS = RADIUS;
    }

    public double getArea() {
        return 3.14*RADIUS*RADIUS;
    }

    public double getCirCumference() {
        return 2*3.14*RADIUS;
    }
}