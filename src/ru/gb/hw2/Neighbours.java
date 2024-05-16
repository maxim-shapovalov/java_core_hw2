package ru.gb.hw2;

public class Neighbours {
    public static boolean neighbours(int[]arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
