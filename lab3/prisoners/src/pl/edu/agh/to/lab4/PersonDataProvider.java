package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDataProvider implements ISuspectAggregate {

    private final Collection<Person> cracowCitizens = new ArrayList<>();
    private Collection<Suspect> cracowSuspects = new ArrayList<>();

    public PersonDataProvider() {
        cracowCitizens.add(new Person("Jan", "Kowalski", "00230102137", 30));
        cracowCitizens.add(new Person("Janusz", "Krakowski", "00230102137", 30));
        cracowCitizens.add(new Person("Janusz", "Mlodociany", "00230102137", 10));
        cracowCitizens.add(new Person("Kasia", "Kosinska", "00230102137", 19));
        cracowCitizens.add(new Person("Piotr", "Zgredek", "00230102137", 29));
        cracowCitizens.add(new Person("Tomek", "Gimbus", "00230102137", 14));
        cracowCitizens.add(new Person("Janusz", "Gimbus", "00230102137", 15));
        cracowCitizens.add(new Person("Alicja", "Zaczarowana", "00230102137", 22));
        cracowCitizens.add(new Person("Janusz", "Programista", "00230102137", 77));
        cracowCitizens.add(new Person("Pawel", "Pawlowicz", "00230102137", 32));
        cracowCitizens.add(new Person("Krzysztof", "Mendel", "00230102137", 30));

        cracowSuspects = new ArrayList<Suspect>(cracowCitizens);
    }

    public Collection<Person> getAllCracowCitizens() {
        return cracowCitizens;
    }

    @Override
    public Iterator<Suspect> iterator() {
        return cracowSuspects.iterator();
    }
}
