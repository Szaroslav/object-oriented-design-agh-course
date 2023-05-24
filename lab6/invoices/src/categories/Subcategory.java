package categories;

import java.util.ArrayList;
import java.util.List;

public class Subcategory extends AbstractCategory {
    private final List<Subcategory> children = new ArrayList<>();

    public Subcategory(String name) {
        super(name);
    }

    public List<Subcategory> getChildren() {
        return children;
    }
}
