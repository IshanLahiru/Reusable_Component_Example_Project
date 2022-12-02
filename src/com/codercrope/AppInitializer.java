package com.codercrope;

import com.codercrope.util.Navigations;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Navigations.nav.InitNavigation();
    }
}
