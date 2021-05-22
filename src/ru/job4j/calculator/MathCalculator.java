package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(sum(first, second), multiply(first, second));
    }

    public static double subAndDiv(double first, double second) {
        return sum(subtraction(first, second), division(first, second));
    }

    public static double sumAllOperation(double first, double second) {
        return sum(sumAndMultiply(first, second), subAndDiv(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результаты расчета: " + System.lineSeparator()
                + " sumAndMultiply: " + sumAndMultiply(10, 20) + System.lineSeparator()
                + " subAndDiv: " + subAndDiv(10, 20) + System.lineSeparator()
                + " sumAllOperation: " + sumAllOperation(10, 20));
    }
}
