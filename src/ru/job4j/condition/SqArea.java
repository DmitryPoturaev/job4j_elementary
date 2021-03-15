package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        return k * Math.pow((p / (2 * (k + 1))), 2);
    }

    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = 2, real = " + SqArea.square(6, 2));
    }
}
