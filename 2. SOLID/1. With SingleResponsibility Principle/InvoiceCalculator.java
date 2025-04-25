import java.util.List;

public class InvoiceCalculator {
    public double calculateTotal(List<Item> items) {
        double totalAmount = 0;
        for(Item item : items) {
            totalAmount += item.getPrice();
        } return totalAmount;
    }
}