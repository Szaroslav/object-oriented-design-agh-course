package pl.edu.agh.dronka.shop.model.items;

import pl.edu.agh.dronka.shop.model.Category;

import java.util.LinkedHashMap;
import java.util.Map;

public class Item {

	private String name;

	private Category category;

	private int price;

	private int quantity;

	private boolean secondhand;

	private boolean polish;

	public Item(String name, Category category, int price, int quantity) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSecondhand(boolean secondhand) {
		this.secondhand = secondhand;
	}

	public boolean isSecondhand() {
		return secondhand;
	}

	public void setPolish(boolean polish) {
		this.polish = polish;
	}

	public boolean isPolish() {
		return polish;
	}

	public Map<String, Object> getAllProperties() {
		Map<String, Object> propertiesMap = new LinkedHashMap<>();

		propertiesMap.put("Nazwa", getName());
		propertiesMap.put("Cena", getPrice());
		propertiesMap.put("Kategoria", getCategory().getDisplayName());
		propertiesMap.put("Ilość", Integer.toString(getQuantity()));
		propertiesMap.put("Tanie bo polskie", isPolish());
		propertiesMap.put("Używany", isSecondhand());

		return propertiesMap;
	}

	@Override
	public String toString() {
		return getName();
	}
}
