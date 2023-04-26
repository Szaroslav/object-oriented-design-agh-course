package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDataProvider implements ISuspectAggregate {
    private final Collection<Student> students = new ArrayList<>();
    private final Collection<Suspect> suspects = new ArrayList<>();

    public StudentDataProvider() {

    }

    @Override
    public Iterator<Suspect> iterator() {
        return suspects.iterator();
    }

    private void addStudent(Student student) {
        students.add(student);
        suspects.add(student);
    }
}
