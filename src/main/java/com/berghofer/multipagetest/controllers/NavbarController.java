package com.berghofer.multipagetest.controllers;

import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class NavbarController extends AbstractSceneElement {
    public void onPageOne() throws IOException {
        loader.loadContent("page-one.fxml");
    }

    public void onPageTwo() throws IOException {
        loader.loadContent("page-two.fxml");
    }
}
