package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int result = Max.max(5, 8);
        System.out.println("Max number: " + result);

        result = Max.max(3, 3);
        System.out.println("Max number: " + result);

        result = Max.max(10, 4);
        System.out.println("Max number: " + result);

        result = Max.max(-6, -7);
        System.out.println("Max number: " + result);
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
