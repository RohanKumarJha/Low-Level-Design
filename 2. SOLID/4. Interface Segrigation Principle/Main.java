public class Main {
    public static void main(String[] args) {
        Cook cook = new Chef();
        cook.cook();
        Serve serve = new Waiter();
        serve.serve();
        Wash wash = new HouseKeeping();
        wash.wash();
    }
}
