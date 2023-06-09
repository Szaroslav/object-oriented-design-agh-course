package configs;

import dokumenty.Faktura;
import dokumenty.PrintDiscountedInvoice;
import dokumenty.PrintInvoice;
import rabaty.ObliczCenePoRabacie;
import rabaty.PercentageDiscountCalculator;

public class Configuration {
    private static Configuration configuration = null;
    private final double PERCENTAGE_DISCOUNT_VALUE;
    private final double LINEAR_DISCOUNT_VALUE;
    private final ObliczCenePoRabacie discountCalculator;
    private final PrintInvoice printInvoice;

    private Configuration() {
        PERCENTAGE_DISCOUNT_VALUE = 0.1;
        LINEAR_DISCOUNT_VALUE = 10;
        discountCalculator = new PercentageDiscountCalculator();
        printInvoice = new PrintDiscountedInvoice();
    }

    public static Configuration getInstance() {
        if (configuration == null)
            configuration = new Configuration();

        return configuration;
    }

    public double get_percentage_discount() {
        return PERCENTAGE_DISCOUNT_VALUE;
    }

    public double get_linear_discount() {
        return LINEAR_DISCOUNT_VALUE;
    }

    public ObliczCenePoRabacie getDiscountCalculator() {
        return discountCalculator;
    }

    public PrintInvoice getPrinter() {
        return printInvoice;
    }
}
