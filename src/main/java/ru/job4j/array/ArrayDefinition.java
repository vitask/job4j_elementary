package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surname.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Alexander Alexandrov";
        names[3] = "Pavel Pavlov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
