package com.epam.konstantin_frolov.java.lesson8.task1.models;

public class Fridge extends Something {
    public Fridge(Sizes size, String power, String state) {
        super(size, power, state);
    }

    @Override
    public String toString() {
        StringBuilder strSomething = new StringBuilder();
        strSomething
                .append("[Object] Fridge").append("\n")
                .append(super.toString()).append("\n");
        return String.valueOf(strSomething);
    }
}