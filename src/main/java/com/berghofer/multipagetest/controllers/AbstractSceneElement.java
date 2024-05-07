package com.berghofer.multipagetest.controllers;

/**
 * This class holds the logic for any controller that needs to tell an AbstractSceneLoader to do things.
 */
public abstract class AbstractSceneElement {
    protected AbstractSceneLoader loader;

    public void setLoader(AbstractSceneLoader loader) {
        this.loader = loader;
    }

    public AbstractSceneLoader getLoader() {
        return loader;
    }
}
