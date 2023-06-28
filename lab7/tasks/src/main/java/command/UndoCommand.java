package command;

public class UndoCommand extends Command
{
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        editor.undo();
    }
}
