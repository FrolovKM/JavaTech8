package com.epam.konstantin_frolov.java.lesson8.task1;

public class UtilHelp {
    private static final String prefixOfClasses = "com.epam.konstantin_frolov.java.lesson8.task1.models.";
    private static final String prefixOfPath = "src/com/epam/konstantin_frolov/java/lesson8/task1/";

    public static String getPathToFile(String fileName) {
        return UtilHelp.prefixOfPath + fileName;
    }

    public static String getPathToClass(String className) {
        return UtilHelp.prefixOfClasses + className;
    }
}