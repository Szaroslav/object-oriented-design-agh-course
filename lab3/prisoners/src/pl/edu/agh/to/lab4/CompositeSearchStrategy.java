package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.List;

public class CompositeSearchStrategy implements ISearchStrategy {
    private final List<ISearchStrategy> searchStrategies = new ArrayList<>();

    @Override
    public boolean filter(Suspect suspect) {
        for (ISearchStrategy strategy : searchStrategies) {
            if (!strategy.filter(suspect))
                return false;
        }

        return true;
    }

    public addStrategy(ISearchStrategy strategy) {
        searchStrategies.add(strategy);
    }
}
