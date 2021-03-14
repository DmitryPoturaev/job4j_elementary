package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;

        System.out.print("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") ");
        System.out.println(Point.distance(x1, y1, x2, y2));

        x1 = 3;
        x2 = 15;
        y1 = 6;
        y2 = 9;
        System.out.print("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") ");
        System.out.println(Point.distance(x1, y1, x2, y2));

        x1 = 367;
        x2 = 35;
        y1 = 87;
        y2 = 238;
        System.out.print("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") ");
        System.out.println(Point.distance(x1, y1, x2, y2));
    }
}
