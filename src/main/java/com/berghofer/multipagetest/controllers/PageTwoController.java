package com.berghofer.multipagetest.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PageTwoController {
    @FXML
    protected Label text;
    @FXML
    protected TextField textInput;

    public void setText() {
        text.setText(textInput.getText());
    }

}
