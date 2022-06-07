package ru.job4j.condition;

public class Film {

    public static String permission(int age) {
        boolean can = age >= 18;
        String label = can ? "Please enjoy it." : "You can't watch this.";
        return label;
    }

    public static void main(String[] args) {
        String message = Film.permission(19);
        System.out.println(message);
        message = Film.permission(7);
        System.out.println(message);
    }
}
