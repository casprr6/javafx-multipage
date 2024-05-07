package com.berghofer.multipagetest.controllers;

import com.berghofer.multipagetest.MultiPageApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * This class and the AbstractSceneElement class make the foundations of my method of loading pages into other pages.
 * This class holds the logic that all controllers which load pages into their own page must inherit.
 * The class has a contentBlock variable which represents the Node that will be parent to the newly loaded page.
 * I'm not gonna lie, this all works in my head but explaining my thoughts is hard.
 */
public abstract class AbstractSceneLoader {
    @FXML
    protected AnchorPane contentBlock;

    /**
     * Removes all children in the contentBlock node.
     */
    public void clearContent() {
        contentBlock.getChildren().clear();
    }

    /**
     * Loads an FXML file and puts the root node into the children of contentBlock.
     * @param fileName The name of the FXML file to load.
     * @throws IOException
     */
    public void loadContent(String fileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MultiPageApp.class.getResource(fileName));
        clearContent();
        contentBlock.getChildren().add(fxmlLoader.load());
    }
}
