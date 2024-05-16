package ru.gb.hw2;

public class Even {
    public static int events(int[]arr){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                x++;
            }
        }
        return x;
    }
}
