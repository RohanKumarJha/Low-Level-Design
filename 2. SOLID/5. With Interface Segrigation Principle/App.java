public class App {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        printer.print(null);

        MultiFunctionMachine advancePrinter = new MultiFunctionMachine();
        advancePrinter.print(null);
        advancePrinter.scan(null);
        advancePrinter.sendFax(null);
    }
}
