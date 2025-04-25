import java.util.List;

public class Invoice {
    private InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
    private InvoicePrinter invoicePrinter = new InvoicePrinter();

    public double calculateTotal(List<Item> items) {
        return invoiceCalculator.calculateTotal(items);
    }

    public void printInvoice(Invoice invoice) {
        invoicePrinter.printInvoice(invoice);
    }

}
