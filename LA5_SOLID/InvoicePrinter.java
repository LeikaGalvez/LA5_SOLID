package LA5_SOLID;

public class InvoicePrinter implements InvoiceGenerator{
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
