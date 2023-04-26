package pl.edu.agh.to.lab4;

public class Student extends Suspect {
    private String index;

    public Student(String firstName, String lastName, String id, int age, String index) {
        super(firstName, lastName, id, age);
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public boolean canBeAccused() {
        return true;
    }
}
