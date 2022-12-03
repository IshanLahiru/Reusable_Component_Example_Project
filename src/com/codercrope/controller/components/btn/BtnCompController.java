package com.codercrope.controller.components.btn;

import com.codercrope.controller.WindowController;
import com.codercrope.controller.components.ComponentCotnroller;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class BtnCompController implements ComponentCotnroller {
    public Button btnOk;
    private WindowController controller;
    private String task;

    public void btnOkOnAction(ActionEvent actionEvent) throws IOException {
        controller.performeActions(this.task, actionEvent, "NOT_A_TEXT_COMPONENT");
    }


    @Override
    public void setController(String add, WindowController controller, String task) {
        btnOk.setText(add);
        this.controller = controller;
        this.task = task;

    }
}
