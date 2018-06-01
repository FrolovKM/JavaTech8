package com.epam.konstantin_frolov.java.lesson8.task1.models;

public class Iron extends Something {
    public Iron(Sizes size, String power, String state) {
        super(size, power, state);
    }

    @Override
    public String toString() {
        StringBuilder strSomething = new StringBuilder();
        strSomething
                .append("[Object] Iron").append("\n")
                .append(super.toString()).append("\n");
        return String.valueOf(strSomething);
    }
}