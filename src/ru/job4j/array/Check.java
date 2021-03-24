package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean b : data) {
            if (data[0] != b) {
                return false;
            }
        }
        return result;
    }
}
