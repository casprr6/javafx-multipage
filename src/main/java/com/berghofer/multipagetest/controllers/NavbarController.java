package com.berghofer.multipagetest.controllers;

import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * The NavbarController class extends the AbstractSceneElement class as it needs to talk directly to the scene loader.
 * In this case the scene loader is the LayoutController which extends the AbstractSceneLoader.
 * This class just holds the logic for the buttons on the navbar.
 */
public class NavbarController extends AbstractSceneElement {
    /**
     * This function handles the logic for the 'Page One' button on the navbar.
     * It tells the loader to load the content from 'page-one.fxml'.
     * @throws IOException
     */
    public void onPageOne() throws IOException {
        loader.loadContent("page-one.fxml");
    }

    /**
     * This function handles the logic for the 'Page Two' button on the navbar.
     * It tells the loader to load the content from 'page-two.fxml'.
     * @throws IOException
     */
    public void onPageTwo() throws IOException {
        loader.loadContent("page-two.fxml");
    }
}
