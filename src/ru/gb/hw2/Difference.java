package ru.gb.hw2;
import java.util.Arrays;

public class Difference {
    public static int difference(int[]arr){
        Arrays.sort(arr);
        int x = arr[arr.length-1] - arr[0];
        return x;
    }
}
