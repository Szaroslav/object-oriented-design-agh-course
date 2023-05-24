package dokumenty;

public class PrintDiscountedInvoice extends PrintInvoice {
    @Override
    protected void printDiscount(Faktura invoice) {
        System.out.println("Zaoszczędzone pieniądze: " + (invoice.getSuma() - invoice.getDiscountedTotalPrice()));
    }
}
