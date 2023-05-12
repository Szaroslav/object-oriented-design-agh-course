package rabaty;

import configs.Configuration;

public class PercentageDiscountCalculator implements ObliczCenePoRabacie {
    public static final double DISCOUNT_VALUE = 0.1;

    @Override
    public double obliczCenePoRabacie(double cena) {
        final double discount = Configuration.getInstance().get_percentage_discount();
        return Math.max((1 - discount) * cena, 0);
    }
}
