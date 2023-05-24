package categories;

import magazyn.Towar;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCategory {
    protected final String name;
    protected List<Towar> merchandises = new ArrayList<>();

    protected AbstractCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Towar> getMerchandises() {
        return merchandises;
    }
}
