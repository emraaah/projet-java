import stamps.controllers.*;
import stamps.models.Stamps;
import stamps.models.Livre;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/catalogue/global.fxml"));

        Stamps stamps = new Stamps();

        fxmlLoader.setControllerFactory(ic -> {

            if (ic.equals(Stamps.class)) return stamps;
            else
                return null;

        });

        Scene scene = new Scene(fxmlLoader.load(), 1300, 900);
        stage.setTitle("Catalogue de Livres");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}