package com.berghofer.multipagetest.controllers;

import com.berghofer.multipagetest.MultiPageApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public abstract class AbstractSceneLoader {
    @FXML
    protected AnchorPane contentBlock;

    public void clearContent() {
        contentBlock.getChildren().clear();
    }

    public void loadContent(String fileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MultiPageApp.class.getResource(fileName));
        clearContent();
        contentBlock.getChildren().add(fxmlLoader.load());
    }
}
