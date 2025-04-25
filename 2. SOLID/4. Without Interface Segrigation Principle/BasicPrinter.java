public class BasicPrinter implements MultiFunctionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        // Unnecessary for this class
        throw new UnsupportedOperationException("Scanning not supported!");
    }

    @Override
    public void fax(String document) {
        // Unnecessary for this class
        throw new UnsupportedOperationException("Faxing not supported!");
    }
}
