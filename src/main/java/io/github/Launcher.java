package io.github;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/BaseView.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root));
        stage.setTitle("JOPT Authenticator");
        //stage.setMaximized(false);
        stage.setResizable(false);

        stage.getIcons().add(new Image(
                Objects.requireNonNull(Launcher.class.getResource("/fxml/img/program-icon-128.png")).toString()));

        stage.getScene().getStylesheets().add(
                Objects.requireNonNull(Launcher.class.getResource("/fxml/css/DarkTheme.css")).toString());

        stage.show();
    }
}
