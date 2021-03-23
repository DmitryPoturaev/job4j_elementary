package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean b : data) {
            result &= data[0] == b;
            if (!result) {
                break;
            }
        }
        return result;
    }
}
