package com.berghofer.multipagetest.controllers;

import javafx.fxml.FXML;

import java.io.IOException;

public class LayoutController extends AbstractSceneLoader {
    @FXML
    private NavbarController navbarController;

    @FXML
    protected void initialize() throws IOException {
        navbarController.setLoader(this);
    }




}
