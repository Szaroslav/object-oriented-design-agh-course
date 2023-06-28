package command;

import javafx.stage.Stage;
import javafx.scene.Scene;


public class Application extends javafx.application.Application
{
    public String clipboard;

    @Override
    public void start(Stage stage) {
        Editor editor = new Editor();
        editor.init();
        Scene scene = new Scene(editor);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        javafx.application.Application.launch(args);
    }
}
