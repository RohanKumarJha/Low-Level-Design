public class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void sendFax(String document) {
        System.out.println("Sending fax: " + document);
    }
}
