package com.berghofer.multipagetest.controllers;

public abstract class AbstractSceneElement {
    protected AbstractSceneLoader loader;

    public void setLoader(AbstractSceneLoader loader) {
        this.loader = loader;
    }

    public AbstractSceneLoader getLoader() {
        return loader;
    }
}
