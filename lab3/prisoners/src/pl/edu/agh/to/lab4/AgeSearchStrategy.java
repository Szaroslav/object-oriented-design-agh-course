package pl.edu.agh.to.lab4;

public class AgeSearchStrategy implements ISearchStrategy {
    @Override
    public boolean filter(Suspect suspect) {
        return suspect.getAge() >= 18;
    }
}
