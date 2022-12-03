package com.codercrope.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.codercrope.util.Windows.WINDOW01;
import static com.codercrope.util.Windows.WINDOW02;

public class Navigation {
    public HashMap<Windows, Stage> windows;

    public Navigation() {
        this.windows =new HashMap<Windows,Stage>();
    }

    public void InitNavigation() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/codercrope/view/Window1View.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
        Stage stage = new Stage();
        stage.setTitle("Window1");
        stage.setScene(new Scene(root1));
        windows.put(WINDOW01,stage);
        stage.show();
    }

    public void navigate(Windows window) throws IOException {
        switch (window){
            case WINDOW01:
                if (windows.containsKey(WINDOW01)) {
                    System.out.println("returning the previous made window 1");
                    windows.get(WINDOW01).show();
                    closeWindowsExcept(WINDOW01);
                }else{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/codercrope/view/Window1View.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
                    System.out.println("Initializing the window 1 ");
                    Stage stage = new Stage();
                    stage.setTitle("Window1");
                    stage.setScene(new Scene(root1));
                    windows.put(WINDOW01,stage);
                    stage.show();
                    closeWindowsExcept(WINDOW01);
                }
                break;
            case WINDOW02:
                if (windows.containsKey(WINDOW02)) {
                    System.out.println("returning the previous made window 2");
                    windows.get(WINDOW02).show();
                }else{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/codercrope/view/Window2View.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
                    System.out.println("Initializing the window 2 ");
                    Stage stage = new Stage();
                    stage.setTitle("Window2");
                    stage.setScene(new Scene(root1));
                    windows.put(WINDOW02,stage);
                    stage.show();
                    closeWindowsExcept(WINDOW02);
                }
                break;
        }
    }

    private void closeWindowsExcept(Windows window) {
        for (Map.Entry<Windows, Stage> entry : windows.entrySet()) {
            if (entry.getKey() != window){
                entry.getValue().hide();
            }
        }
    }
}
