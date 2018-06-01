package com.epam.konstantin_frolov.java.lesson8.task1.models;

import java.util.ArrayList;
import java.util.List;

public class ElSystem {
    private List<Something> somethings = null;

    public ElSystem() {
        this.somethings = new ArrayList<>();
    }

    public List<Something> getSomething() {
        return somethings;
    }

    public void add(Something something) {
        this.somethings.add(something);
    }

    @Override
    public String toString() {
        return "[Object] ElSystem";
    }
}