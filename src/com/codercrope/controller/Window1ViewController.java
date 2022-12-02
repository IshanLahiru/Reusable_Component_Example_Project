package com.codercrope.controller;

import com.codercrope.controller.components.ComponentCotnroller;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class Window1ViewController implements WindowController {
    public Button btnCls;
    public ImageView btnClsImg;
    public Button btnMax;
    public ImageView btnMaxImg;
    public Button btnMin;
    public ImageView btnMinImg;
    public GridPane grid;

    public void initialize() throws IOException {
        ComponentCotnroller controller = getAndLoadButton(1, 2);/*(ComponentCotnroller) fxmlLoader.getController();*/
        controller.setController("Add", (WindowController) this, "TASK_PRINT");

        ComponentCotnroller controller2 = getAndLoadButton(1, 4);/*(ComponentCotnroller) fxmlLoader.getController();*/
        controller2.setController("2 Window", (WindowController) this, "TASK_LOAD_2_WINDOW");

        ComponentCotnroller textBox = getAndLoadTextBox(1, 0);/*(ComponentCotnroller) fxmlLoader.getController();*/
        textBox.setController(" ", (WindowController) this, "TXT_EMAIL");
    }

    @Override
    public void performeActions(String task, Event actionEvent, String txtText) {
        if (task != null) {
            switch (task) {
                case "TASK_PRINT":
                    System.out.println("task is printing");
                    break;
                case "TASK_LOAD_2_WINDOW":
                    System.out.println("loading the second window");
                    break;
                case "TXT_EMAIL":
                    System.out.println(txtText);
                    break;
            }
        }
    }

    public ComponentCotnroller getAndLoadButton(int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/codercrope/view/components/btn/BtnComp.fxml"));
        Button root1 = (Button) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        grid.add(root1, column, row);
        return controller;
    }
    public ComponentCotnroller getAndLoadTextBox(int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/codercrope/view/components/txt/TxtBoxComp.fxml"));
        TextField root1 = (TextField) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        grid.add(root1, column, row);
        return controller;
    }

    public void btnClsClickEvt(MouseEvent mouseEvent) {
    }

    public void btnMaxOnAction(ActionEvent actionEvent) {
    }

    public void btnMinOnAction(ActionEvent actionEvent) {
    }
}
