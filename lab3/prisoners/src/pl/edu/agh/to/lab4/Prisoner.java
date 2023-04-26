package pl.edu.agh.to.lab4;

public class Prisoner extends Suspect {
    private final int judgementYear;
    private final int sentenceDuration;

    public Prisoner(String firstName, String lastName, String id, int age, int judgementYear, int sentenceDuration) {
        super(firstName, lastName, id, age);
        this.judgementYear = judgementYear;
        this.sentenceDuration = sentenceDuration;
    }

    @Override
    public boolean canBeAccused() {
        return !isJailedNow();
    }

    public boolean isJailedNow() {
        return judgementYear + sentenceDuration >= Utilities.getCurrentYear();
    }

}
