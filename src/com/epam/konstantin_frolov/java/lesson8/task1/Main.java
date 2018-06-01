package com.epam.konstantin_frolov.java.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Device device = new Device();

        device.foundElSystem();

        device.addIron();
        device.addTV();
        device.addOwen();
        device.addFridge();

        device.printElSystem();


    }
}