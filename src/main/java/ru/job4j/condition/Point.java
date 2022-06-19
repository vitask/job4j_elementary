package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(pow(this.x - that.x, 2)
                + pow(this.y - that.y, 2)
                + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + "," + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(4, 0, 2);
        Point b = new Point(2, 0, 2);
        double dist3 = a.distance3d(b);
        System.out.println(dist3);
    }
}
