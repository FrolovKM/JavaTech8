package com.epam.konstantin_frolov.java.lesson8.task1;

import com.epam.konstantin_frolov.java.lesson8.task1.models.*;
import com.epam.konstantin_frolov.java.lesson8.task1.*;

import java.io.File;
import java.util.List;

public class Device {
    private ElSystem eSystem = null;

    public void foundElSystem() {
        if (eSystem != null) {
            System.out.println("Electricy system found");
            return;
        }

        this.eSystem = new ElSystem();
    }

    public void addTV() {
        this.eSystem.add(this.getTV());
    }

    public void addFridge() {
        this.eSystem.add(this.getFridge());
    }

    public void addIron() {
        this.eSystem.add(this.getIron());
    }

    public void addOwen() {
        this.eSystem.add(this.getOwen());
    }

    public void printElSystem() {
        System.out.println("ElSystem:");
        this.printSomething(this.eSystem.getSomething());
    }

    public void viewElSystem() {
        this.eSystem = null;
    }

    public void printAllTech() {
        StringBuilder strSomething = new StringBuilder();

        strSomething.append("Available tech:").append('\n');

        strSomething.append("Iron").append('\n');
        strSomething.append("Fridge").append('\n');
        strSomething.append("TV").append('\n');
        strSomething.append("Owen").append('\n');

        System.out.println(strSomething);
    }

    private void printSomething(List<Something> somethings) {
        somethings.forEach(something -> {
            System.out.print(something.toString());
        });
    }

    private Something getSomething(String name) {
        File pathToSomething = new File(UtilHelp.getPathToFile("something.xml"));

        return Parser.getSomethingByXML(pathToSomething, name);
    }

    private Iron getIron() {
        return (Iron) this.getSomething("Iron");
    }

    private Fridge getFridge() {
        return (Fridge) this.getSomething("Fridge");
    }

    private TV getTV() {
        return (TV) this.getSomething("TV");
    }

    private Owen getOwen() {
        return (Owen) this.getSomething("Owen");
    }
}