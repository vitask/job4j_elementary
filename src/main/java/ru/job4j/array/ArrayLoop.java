package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 2 + 3;
        }
        for (int num : number) {
            System.out.println(num);
        }
    }
}
