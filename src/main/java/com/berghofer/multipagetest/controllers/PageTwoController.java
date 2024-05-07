package com.berghofer.multipagetest.controllers;

import com.berghofer.multipagetest.ViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * The controller for page two.
 */
public class PageTwoController {
    @FXML
    protected Label text;
    @FXML
    protected TextField textInput;

    /**
     * The initialize function is called by JavaFX when the root element associated with this controller is finished
     * loading.
     */
    @FXML
    private void initialize() {
        text.setText(ViewModel.getInstance().text);
    }

    /**
     * Public function used to set the text above the input box.
     */
    public void setText() {
        // The ViewModel's data is set and then the text element is set based on that.
        ViewModel.getInstance().text = textInput.getText();
        text.setText(ViewModel.getInstance().text);
    }

}
