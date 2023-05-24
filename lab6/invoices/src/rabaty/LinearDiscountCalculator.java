package rabaty;

import configs.Configuration;

public class LinearDiscountCalculator implements ObliczCenePoRabacie {
    public static final double DISCOUNT_VALUE = 10;

    @Override
    public double obliczCenePoRabacie(double cena) {
        final double discount = Configuration.getInstance().get_linear_discount();
        return Math.max(cena - discount, 0);
    }
}