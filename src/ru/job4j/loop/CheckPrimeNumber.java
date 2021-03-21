package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i < number - 1; i++) {
            if (i == 2) {
                prime = number % i != 0;
            } else {
                prime &= number % i != 0;
            }
            if (!prime) {
                break;
            }
        }
        return prime;
    }
}
