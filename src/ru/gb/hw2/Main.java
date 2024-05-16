package ru.gb.hw2;

public class Main {
    public static void main(String[] args) {
        // возвращает количество чётных элементов массива
        int[]arr = {9, 2, 1, 2, 3, 4, 7};
        System.out.println(Even.events(arr));

        // возвращает разницу между самым большим и самым маленьким элементами переданного не пустого массива
        int[]arr2 = {3, 2, 8, 2, 3, 4, 6};
        System.out.println(Difference.difference(arr2));

        // возвращает истину, если в переданном массиве есть два соседних элемента с нулевым значением
        int[]arr3 = {1, 8, 4, 0, 4, 6};
        System.out.println(Neighbours.neighbours(arr3));
    }
}
