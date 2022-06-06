package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenX00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10To10Then0() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX32To21Then1dot41() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 1.41;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX10To15Then5() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }
}