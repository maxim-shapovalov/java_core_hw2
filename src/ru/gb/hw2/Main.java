package ru.gb.hw2;

public class Main {
    public static void main(String[] args) {
        // ���������� ���������� ������ ��������� �������
        int[]arr = {9, 2, 1, 2, 3, 4, 7};
        System.out.println(Even.events(arr));

        // ���������� ������� ����� ����� ������� � ����� ��������� ���������� ����������� �� ������� �������
        int[]arr2 = {3, 2, 8, 2, 3, 4, 6};
        System.out.println(Difference.difference(arr2));

        // ���������� ������, ���� � ���������� ������� ���� ��� �������� �������� � ������� ���������
        int[]arr3 = {1, 8, 4, 0, 4, 6};
        System.out.println(Neighbours.neighbours(arr3));
    }
}
