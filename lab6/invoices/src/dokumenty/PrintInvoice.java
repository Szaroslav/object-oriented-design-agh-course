package dokumenty;

import java.util.Iterator;

public class PrintInvoice {
    public void printInvoice(Faktura invoice) {
        printHeader(invoice);
        printEntries(invoice);
        printDiscount(invoice);
        printFooter(invoice);
    }

    protected void printHeader(Faktura invoice) {
        System.out.println("=====================================================");
        System.out.println("FA z dnia: " + invoice.getDataSprzedazy().toString());
        System.out.println("Wystawiona dla: " + invoice.getKontrahent());
    }

    protected void printEntries(Faktura invoice) {
        Iterator<Pozycja> iteratorPozycji = invoice.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja = iteratorPozycji.next();
            System.out.println("Towar: " + pozycja.getNazwa() + " Ilosc: " + pozycja.getIlosc() + " Wartosc:" + pozycja.getWartosc());
        }
    }

    protected void printDiscount(Faktura invoice) {}

    protected void printFooter(Faktura invoice) {
        System.out.println("Na kwote: " + invoice.getSuma());
        System.out.println("=====================================================");
    }
}
