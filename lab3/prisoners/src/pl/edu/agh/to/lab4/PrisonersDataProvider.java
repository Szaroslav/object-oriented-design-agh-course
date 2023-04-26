package pl.edu.agh.to.lab4;

import java.util.*;

public class PrisonersDataProvider implements ISuspectAggregate {
    private final Map<String, Collection<Prisoner>> prisoners = new HashMap<>();
    private Collection<Suspect> suspects = new ArrayList<>();

    public PrisonersDataProvider() {
        addPrisoner("Wiezienie krakowskie", new Prisoner("Jan", "Kowalski", "87080452357", 21, 2005, 7));
        addPrisoner("Wiezienie krakowskie", new Prisoner("Anita", "Wiercipieta", "84080452357", 18, 2009, 3));
        addPrisoner("Wiezienie krakowskie", new Prisoner("Janusz", "Zlowieszczy", "92080445657", 45, 2001, 10));
        addPrisoner("Wiezienie przedmiejskie", new Prisoner("Janusz", "Zamkniety", "802104543357", 32,  2010, 5));
        addPrisoner("Wiezienie przedmiejskie", new Prisoner("Adam", "Future", "880216043357", 2020, 67, 5));
        addPrisoner("Wiezienie przedmiejskie", new Prisoner("Zbigniew", "Nienajedzony", "90051452335", 2011, 42, 1));
        addPrisoner("Wiezienie centralne", new Prisoner("Jan", "Przedziwny", "91103145223", 2009, 34, 4));
        addPrisoner("Wiezienie centralne", new Prisoner("Janusz", "Podejrzany", "85121212456", 2012, 39, 1));
    }

    public Collection<String> getAllPrisons() {
        return prisoners.keySet();
    }

    @Override
    public Iterator<Suspect> iterator() {
        return suspects.iterator();
    }

    private void addPrisoner(String key, Prisoner prisoner) {
        if (!prisoners.containsKey(key))
            prisoners.put(key, new ArrayList<>());
        prisoners.get(key).add(prisoner);
        suspects.add(prisoner);
    }
}
