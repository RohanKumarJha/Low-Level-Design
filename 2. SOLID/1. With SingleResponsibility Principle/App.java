import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    
        List<Item> list = new ArrayList<>();

        Item item1 = new Item("Pen", 100);
        list.add(item1);

        Item item2 = new Item("Book", 1000);
        list.add(item2);

        Item item3 = new Item("Bag", 1500);
        list.add(item3);

        Item item4 = new Item("WaterBottle", 2000);
        list.add(item4);

        Invoice invoice = new Invoice();
        System.out.println(invoice.calculateTotal(list));
        invoice.printInvoice(invoice);

    }
}
