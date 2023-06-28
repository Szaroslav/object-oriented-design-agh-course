package command;

public class CutCommand extends Command
{
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        application.clipboard = editor.getSelection();
        editor.deleteSelection();
        editor.history.push(this);
    }
}
