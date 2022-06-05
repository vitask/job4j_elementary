package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
        return area;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
        double result2 = TrgArea.area(2, 4, 3);
        System.out.println("area (2, 4, 3) = " + result2);
    }
}
