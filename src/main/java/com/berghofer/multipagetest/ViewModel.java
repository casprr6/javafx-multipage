package com.berghofer.multipagetest;

/**
 * The ViewModel class holds the persistent state across the application by only being accessible through the static
 * getInstance() function.
 */
public class ViewModel {
    private static ViewModel instance;

    public int counter;
    public String text;

    private ViewModel() {
        counter = 0;
        text = "placeholder";
    }

    public static ViewModel getInstance() {
        if (instance == null) {
            instance = new ViewModel();
        }
        return instance;
    }
}
