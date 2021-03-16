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
        int expectEuro = 2;
        int expectDollar = 3;

        String splitter = " - ";

        System.out.println(rubles + " rubles are:");

        int euro = Converter.rubleToEuro(rubles);
        boolean passed = expectEuro == euro;
        System.out.println(splitter + euro + " euro. Test result : " + passed);

        int dollar = Converter.rubleToDollar(rubles);
        passed = expectDollar == dollar;
        System.out.println(splitter + dollar + " dollars. Test result : " + passed);
    }
}
