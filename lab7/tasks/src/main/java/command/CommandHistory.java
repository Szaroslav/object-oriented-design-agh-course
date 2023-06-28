package command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory
{
    private final List<Command> history = new ArrayList<>();

    public void push(Command command) {
        history.add(command);
    }

    public Command pop() {
        return history.remove(history.size() - 1);
    }
}
