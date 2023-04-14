package pl.edu.agh.dronka.shop.model.items;

import pl.edu.agh.dronka.shop.model.Category;

import java.util.Map;

public class ElectronicItem extends Item {
    private boolean isMobile;
    private boolean hasGuarantee;

    ElectronicItem(String name, Category category, int price, int quantity, boolean isMobile, boolean hasGuarantee) {
        super(name, category, price, quantity);
        this.isMobile = isMobile;
        this.hasGuarantee = hasGuarantee;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    @Override
    public Map<String, Object> getAllProperties() {
        Map<String, Object> propertiesMap = super.getAllProperties();

        propertiesMap.put("Mobilny", isMobile());
        propertiesMap.put("Gwarancja", hasGuarantee());

        return propertiesMap;
    }
}
