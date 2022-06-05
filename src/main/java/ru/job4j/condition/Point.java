package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double operation1 = Math.pow((x2 - x1), 2);
        double operation2 = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(operation1 + operation2);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(2, 0, 5, 0);
        System.out.println("result (2, 0) to (5, 0) " + result2);
    }
}
