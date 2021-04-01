package ru.job4j.array;

public class FindLoop {
    /**
     * Возвращает индекс элемента массива
     * @param data массив целочисленных значений
     * @param el искомый элемент в массиве
     * @return если элемент найде, то его индекс, иначе -1
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Возвращает индекс элемента массива в диапазоне индексов
     * @param data массив целочисленных значений
     * @param el искомый элемент в массиве
     * @param start индекс начала диапазона
     * @param finish индекс конца диапазона
     * @return если элемент найде, то его индекс, иначе -1
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                return  index;
            }
        }
        return rst;
    }
}
