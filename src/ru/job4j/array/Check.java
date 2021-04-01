package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean b : data) {
            if (data[0] != b) {
                return false;
            }
        }
        return true;
    }
}
