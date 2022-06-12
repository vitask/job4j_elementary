package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int kolya) {
        int month = 0;
        while (ivan <= kolya) {
            ivan *= 3;
            kolya *= 2;
            month++;
        }
        return month;
    }
}
