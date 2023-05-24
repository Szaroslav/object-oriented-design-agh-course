package magazyn;

import categories.Category;
import categories.Subcategory;

import java.util.ArrayList;
import java.util.List;

public class MerchandiseManager {
    private final List<Towar> merchandises = new ArrayList<>();
    private final List<Category> categories = new ArrayList<>();
    private final List<Subcategory> subcategories = new ArrayList<>();

    public MerchandiseManager() {
        // Create merchandises
        merchandises.add(new Towar(200, "Spalding TF-500"));
        merchandises.add(new Towar(3500, "Iphone 14 Pro Max"));

        // Create categories
        categories.add(new Category("Electronics"));
        categories.get(0).getMerchandises().add(merchandises.get(1));
        categories.add(new Category("Sports"));
        categories.get(1).getMerchandises().add(merchandises.get(0));

        // Create subcategories
        subcategories.add(new Subcategory("Basketball"));
        subcategories.get(0).getChildren().add(new Subcategory("Balls"));
        subcategories.get(0).getMerchandises().add(merchandises.get(0));
        subcategories.get(0).getChildren().add(new Subcategory("Shoes"));

        subcategories.add(new Subcategory("Mobile phones"));
        subcategories.get(1).getChildren().add(new Subcategory("Motorola"));
        subcategories.get(1).getChildren().add(new Subcategory("Apple"));
        subcategories.get(1).getMerchandises().add(merchandises.get(1));
    }

    public void printAllCategories() {
        printCategories();
        printSubcategories();
    }

    private void printCategories() {
        System.out.println("==============");
        System.out.println("= Categories =");
        System.out.println("==============");
        for (Category c : categories) {
            System.out.println(c.getName());
            for (Towar m : c.getMerchandises()) {
                System.out.println(m.getNazwa() + ", cena jednostkowa: " + m.getCena());
            }
            System.out.println();
        }
    }

    private void printSubcategories() {
        System.out.println("=================");
        System.out.println("= Subcategories =");
        System.out.println("=================");
        for (Subcategory sc : subcategories) {
            printSubcategory(sc);
        }
    }

    private void printSubcategory(Subcategory subcategory) {
        System.out.println(subcategory.getName());
        for (Towar m : subcategory.getMerchandises()) {
            System.out.println(m.getNazwa() + ", cena jednostkowa: " + m.getCena());
        }
        System.out.println();
        for (Subcategory sc : subcategory.getChildren()) {
            printSubcategory(sc);
        }
    }
}
