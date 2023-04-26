package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeAggregate implements ISuspectAggregate {
    private final List<ISuspectAggregate> aggregateList = new ArrayList<>();

    @Override
    public Iterator<Suspect> iterator() {
        // ???
        return null;
    }

    public void addAggregate(ISuspectAggregate aggregate) {
        aggregateList.add(aggregate);
    }
}
