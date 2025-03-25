public class Car {

    private static Car car;

    private Car() {

    }
    public static Car getInstance() {
        if(car == null) {
            car = new Car();
        }
        return car;
    }
}
