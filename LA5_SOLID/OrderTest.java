package LA5_SOLID;

public class OrderTest {
    public static void main(String[] args) {
        TotalCalculator totalCalculator = new CalculatorPrinter();
        OrderPlacer orderPlacer = new OrderPlacerPrinter();

        totalCalculator.calculateTotal(10.0, 2);
        orderPlacer.placeOrder("John Doe", "123 Main St");

        // These methods might not be needed for all orders
        InvoiceGenerator invoiceGenerator = new InvoicePrinter();
        EmailNotifier emailNotifier = new EmailNotifier();

        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");

    }
}
