package com.epam.konstantin_frolov.java.lesson8.task1.models;

public class Sizes {
    private int high;
    private int wight;
    private int depth;

    public Sizes(int high, int wight, int depth) {
        this.high = high;
        this.wight = wight;
        this.depth = depth;
    }

    public int getHigh() {
        return high;
    }

    public int getWight() {
        return wight;
    }

    public int getDepth() {
        return depth;
    }


    @Override
    public String toString() {
        StringBuilder strSizes = new StringBuilder();
        strSizes
                .append("High: ").append(high).append("\n")
                .append("Wight: ").append(wight).append("\n")
                .append("Depth: ").append(depth).append("\n");
        return String.valueOf(strSizes);
    }
}