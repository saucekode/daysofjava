package exercises.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice newInvoice = new Invoice();

        newInvoice.setQuantity(15);
        newInvoice.setPrice(300);

        System.out.println(newInvoice.getQuantity());
        System.out.println(newInvoice.getPrice());
        System.out.println("Invoice amount is: " + newInvoice.getInvoiceItem());
    }
}
