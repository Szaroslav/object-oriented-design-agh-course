package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Finder {
    private final ISuspectAggregate personAggregate;

    private final ISuspectAggregate prisonerAggregate;

    public Finder(ISuspectAggregate personAggregate, ISuspectAggregate prisonerAggregate) {
        this.personAggregate = personAggregate;
        this.prisonerAggregate = prisonerAggregate;
    }

//    public Finder(PersonDataProvider personDataProvider, PrisonersDatabase prisonersDatabase) {
//        this(personDataProvider.getAllCracowCitizens(), prisonersDatabase.findAll());
//    }

    public void displayAllSuspectsWithName(String name) {
        Iterator<Suspect> personIterator = personAggregate.iterator();
        Iterator<Suspect> prisonerIterator = prisonerAggregate.iterator();

        for (Suspect person; personIterator.hasNext();) {
            person = personIterator.next();
            if (person.getAge() > 18 && person.getFirstName().equals(name)) {
                System.out.println(person);
            }
        }

        for (Suspect prisoner; prisonerIterator.hasNext();) {
            prisoner = prisonerIterator.next();
            if (!prisoner.canBeAccused() && prisoner.getLastName().equals(name)) {
                System.out.println(prisoner);
            }
        }
    }
}
