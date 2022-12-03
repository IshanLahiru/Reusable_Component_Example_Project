package com.codercrope.controller.components.txt;

import com.codercrope.controller.WindowController;
import com.codercrope.controller.components.ComponentCotnroller;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class TxtBoxCompController implements ComponentCotnroller {
    public TextField txt;
    private WindowController controller;
    private String task;


    @Override
    public void setController(String add, WindowController controller, String task) {
        //btnOk.setText(add);
        this.controller = controller;
        this.task = task;

    }

    public void txtOnAction(ActionEvent actionEvent) throws IOException {
        controller.performeActions(this.task,actionEvent,txt.getText());
        //System.out.println(txt.getText());
    }

    public void txtKeyRelesedEvent(KeyEvent keyEvent) throws IOException {
        controller.performeActions(this.task,keyEvent,txt.getText());
        //System.out.println(txt.getText());
    }
}
