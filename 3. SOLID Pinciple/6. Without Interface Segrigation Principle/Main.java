public class Main {
    public static void main(String[] args) {
        Hotel cook = new Cook();
        cook.cookFood();
        Hotel wiater = new Waiter();
        wiater.serve();
        Hotel washerman = new Washerman();
        washerman.wash();
    }
}
