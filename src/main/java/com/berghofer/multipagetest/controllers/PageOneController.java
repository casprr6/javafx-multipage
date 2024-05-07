package com.berghofer.multipagetest.controllers;

import com.berghofer.multipagetest.ViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PageOneController {
    @FXML
    protected Label counterLabel;

    /**
     * The initialize function is called by JavaFX when the root element associated with this controller is finished
     * loading.
     */
    @FXML
    private void initialize() {
        // Set label text to whatever is stored int the view-model on page load.
        counterLabel.setText(String.valueOf(ViewModel.getInstance().counter));
    }

    /**
     * The incrementCounter() function increments the view-model's counter variable and applies the new value to the page.
     */
    public void incrementCounter() {
        // The ViewModel's data is set and then the text element is set based on that.
        ViewModel.getInstance().counter++;
        counterLabel.setText(String.valueOf(ViewModel.getInstance().counter));
    }

    /**
     * The decrementCounter() function decrements the view-model's counter variable and applies the new value to the page.
     */
    public void decrementCounter() {
        // The ViewModel's data is set and then the text element is set based on that.
        ViewModel.getInstance().counter--;
        counterLabel.setText(String.valueOf(ViewModel.getInstance().counter));
    }
}
