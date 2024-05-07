package com.berghofer.multipagetest.controllers;

import com.berghofer.multipagetest.ViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * The LayoutController class extends the AbstractSceneLoader class because its FXML file contains an element that
 * needs to hold other FXML hierarchies.
 * It holds the logic for the layout itself. It also handles some of the setup for child nodes.
 */
public class LayoutController extends AbstractSceneLoader {
    /**
     * Despite the IDE claiming that this variable is redundant JavaFX actually *is* aware of the navbar controller.
     * The navbar node in the layout.fxml file has the id 'navbar'. JavaFX implicitly makes a reference to the node's
     * controller as 'navbarController'.
     */
    @FXML
    private NavbarController navbarController;

    @FXML
    private Label pageOneInfo;
    @FXML
    private Label pageTwoInfo;

    @FXML
    private void initialize() throws IOException {
        // When the page loads, the controller for the navbar element has the loader that it controls set to this class.
        // This is a property that is inherited from the AbstractSceneElement.
        navbarController.setLoader(this);

        refreshInfo();
    }

    /**
     * Updates the text on the page to reflect what is stored in the view-model.
     */
    public void refreshInfo() {
        pageOneInfo.setText("Page one says: " + ViewModel.getInstance().counter);
        pageTwoInfo.setText("Page two says: " + ViewModel.getInstance().text);
    }
}
