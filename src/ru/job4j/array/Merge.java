package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] > right[rightIndex]) {
                    rsl[i] = right[rightIndex++];
                } else {
                    rsl[i] = left[leftIndex++];
                }
            } else if (leftIndex < left.length) {
                //rsl[i] = left[leftIndex++];
                System.arraycopy(left, leftIndex, rsl, i, left.length - leftIndex);
                break;
            } else if (rightIndex < right.length) {
                //rsl[i] = right[rightIndex++];
                System.arraycopy(right, rightIndex, rsl, i, right.length - rightIndex);
                break;
            }
        }
        return rsl;
    }
}
