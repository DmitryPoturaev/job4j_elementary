package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int rubles = 190;

        String splitter = " - ";

        System.out.println(rubles + " rubles are:");

        int euro = Converter.rubleToEuro(rubles);
        System.out.println(splitter + euro + " euro.");

        int dollar = Converter.rubleToDollar(rubles);
        System.out.println(splitter + dollar + " dollars.");
    }
}
