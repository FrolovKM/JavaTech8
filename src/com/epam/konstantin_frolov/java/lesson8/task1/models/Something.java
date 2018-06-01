package com.epam.konstantin_frolov.java.lesson8.task1.models;

public class Something {
    private Sizes size = null;
    private String power = null;
    private String state = null;

    public Something(Sizes size, String power, String state) {
        this.size = size;
        this.power = power;
        this.state = state;
    }

    public Sizes getSize() {
        return size;
    }

    public String getPower() {
        return power;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        StringBuilder strElSystem = new StringBuilder();
        strElSystem
                .append("[Object] ElSystem").append("\n")
                .append(size.toString())
                .append("Power: ").append(power).append("\n")
                .append("State: ").append(state).append("\n");
        return String.valueOf(strElSystem);
    }
}