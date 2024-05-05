package LA5_SOLID;

public class OrderPlacerPrinter implements OrderPlacer{
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
