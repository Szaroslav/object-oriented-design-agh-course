package dokumenty;

import java.util.Iterator;

public class PrintInvoice {
    public static void printInvoice(Faktura invoice) {
        System.out.println("=====================================================");
        System.out.println("FA z dnia: " + invoice.getDataSprzedazy().toString());
        System.out.println("Wystawiona dla: " + invoice.getKontrahent());
        System.out.println("Na kwote: " + invoice.getSuma());
        Iterator<Pozycja> iteratorPozycji = invoice.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja = iteratorPozycji.next();
            System.out.println("Towar: " + pozycja.getNazwa() + " Ilosc: " + pozycja.getIlosc() + " Wartosc:" + pozycja.getWartosc());
        }
        System.out.println("=====================================================");
    }
}
