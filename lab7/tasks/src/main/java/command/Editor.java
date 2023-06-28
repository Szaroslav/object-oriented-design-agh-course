package command;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;


public class Editor extends VBox
{
    public String text;
    private final TextArea textArea = new TextArea();
    private final List<Button> buttons = new ArrayList<>();
    public final CommandHistory history = new CommandHistory();

    public Editor() {}

    public void init() {
        // Copy button
        Button copyButton = new Button("Copy");
        copyButton.setOnAction(event -> {
           new CopyCommand(this).execute();
        });
        buttons.add(copyButton);

        // Cut button
        Button cutButton = new Button("Cut");
        cutButton.setOnAction(event -> {
            new CutCommand(this).execute();
        });
        buttons.add(cutButton);

        // Paste button
        Button pasteButton = new Button("Paste");
        pasteButton.setOnAction(event -> {
            new PasteCommand(this).execute();
        });
        buttons.add(pasteButton);

        getChildren().add(textArea);
        getChildren().add(buttons);
    }

    // Not implemented
    public String getSelection() {
        return text;
    }

    public void deleteSelection() {

    }

    public void replaceSelection(String newText) {
        text = newText;
    }

    public void undo() {

    }
}
