package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        /*префикс не может быть короче слова*/
        boolean result = word.length >= pref.length;
        for (int i = 0; result && i < pref.length; i++) {
            result &= word[i] == pref[i];
        }
        return result;
    }
}
