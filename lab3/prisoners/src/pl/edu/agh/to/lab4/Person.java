package pl.edu.agh.to.lab4;

public class Person extends Suspect {
    public Person(String firstName, String lastName, String id, int age) {
        super(firstName, lastName, id, age);
    }

    @Override
    public boolean canBeAccused() {
        return getAge() >= 18;
    }
}
