package com.codercrope.controller;

import com.codercrope.controller.components.ComponentCotnroller;
import com.codercrope.util.Navigations;
import com.codercrope.util.RegxValidator;
import com.codercrope.util.Windows;
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
        ComponentCotnroller controller = getAndLoadButton(1, 2);
        controller.setController("Add", (WindowController) this, "TASK_PRINT");

        ComponentCotnroller controller2 = getAndLoadButton(1, 4);
        controller2.setController("2 Window", (WindowController) this, "TASK_LOAD_2_WINDOW");

        ComponentCotnroller textBox = getAndLoadTextBox(1, 0);
        textBox.setController(" ", (WindowController) this, "TXT_EMAIL");
    }

    @Override
    public void performeActions(String task, Event actionEvent, String txtText) throws IOException {
        if (task != null) {
            switch (task) {
                case "TASK_PRINT":
                    System.out.println("task is printing");
                    break;
                case "TASK_LOAD_2_WINDOW":
                    System.out.println("loading the second window");
                    Navigations.nav.navigate(Windows.WINDOW02);
                    break;
                case "TXT_EMAIL":
                    boolean val = RegxValidator.checkRegex(task, txtText);
                    if (!val){
                        System.out.println("invalid email");
                    }else{
                        System.out.println("not a invalid email");
                    }
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
