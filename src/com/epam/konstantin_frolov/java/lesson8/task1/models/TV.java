package com.epam.konstantin_frolov.java.lesson8.task1.models;

public class TV extends Something {
    public TV(Sizes size, String power, String state) {
        super(size, power, state);
    }

    @Override
    public String toString() {
        StringBuilder strSomething = new StringBuilder();
        strSomething
                .append("[Object] TV").append("\n")
                .append(super.toString()).append("\n");
        return String.valueOf(strSomething);
    }
}