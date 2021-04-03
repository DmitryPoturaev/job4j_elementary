package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int result = Max.max(5, 8);
        System.out.println("Max number: " + result);

        result = Max.max(3, 3);
        System.out.println("Max number: " + result);

        result = Max.max(5, 4, 6);
        System.out.println("Max number: " + result);

        result = Max.max(6, 7, 8, 9);
        System.out.println("Max number: " + result);
    }

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }
}
