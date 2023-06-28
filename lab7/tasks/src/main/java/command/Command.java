package command;

public abstract class Command
{
    protected final Application application;
    protected final Editor editor;
    private String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    public abstract void execute();
}
