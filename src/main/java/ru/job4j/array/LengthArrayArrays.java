package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{3}, {1, 5}, {2, 7, 3}, {2, 1, 4, 8}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: "
                    + numbers[i].length);
        }
    }
}
