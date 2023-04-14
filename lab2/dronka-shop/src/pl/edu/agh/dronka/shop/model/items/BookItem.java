package pl.edu.agh.dronka.shop.model.items;

import pl.edu.agh.dronka.shop.model.Category;

import java.util.Map;

public class BookItem extends Item {
    private int pageNumber;
    private boolean hardCover;

    BookItem(String name, Category category, int price, int quantity, int pageNumber, boolean hardCover) {
        super(name, category, price, quantity);
        this.pageNumber = pageNumber;
        this.hardCover = hardCover;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public boolean hasHardCover() {
        return hardCover;
    }

    @Override
    public Map<String, Object> getAllProperties() {
        Map<String, Object> propertiesMap = super.getAllProperties();

        propertiesMap.put("Liczba stron", getPageNumber());
        propertiesMap.put("Twarda oprawa", hasHardCover());

        return propertiesMap;
    }
}
