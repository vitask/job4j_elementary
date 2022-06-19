package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenX00To02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10To10Then0() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX32To21Then1dot41() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10To15Then5() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 5);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }
}