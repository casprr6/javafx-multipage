package com.berghofer.multipagetest.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PageOneController {
    @FXML
    protected Label counter;

    public void incrementCounter() {
        int amnt = Integer.parseInt(counter.getText());
        counter.setText(String.valueOf(amnt + 1));
    }

    public void decrementCounter() {
        int amnt = Integer.parseInt(counter.getText());
        counter.setText(String.valueOf(amnt - 1));
    }
}
