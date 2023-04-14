package pl.edu.agh.to.lab4;

public abstract class Suspect {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String id;

    public Suspect(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }



    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public abstract boolean canBeAccused();
}
