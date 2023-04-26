package pl.edu.agh.to.lab4;

public class NameSearchStrategy implements ISearchStrategy {
    @Override
    public boolean filter(Suspect suspect) {
        return suspect.getLastName().equals("Henry");
    }
}
