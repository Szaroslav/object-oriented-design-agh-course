package rabaty;

import rabatlosowy.LosowyRabat;

public class RandomPercentageDiscountCalculator implements ObliczCenePoRabacie {
    @Override
    public double obliczCenePoRabacie(double cena) {
        final double discount = new LosowyRabat().losujRabat();
        return Math.max((1 - discount) * cena, 0);
    }
}
