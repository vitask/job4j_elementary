package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax12To5Then12() {
        int first = 12;
        int second = 5;
        int expected = 12;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To7The7() {
        int first = 8;
        int second = 8;
        int expected = 8;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax3To9Then9() {
        int first = 3;
        int second = 9;
        int expected = 9;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax10And20And15Then20() {
        int first = 10;
        int second = 20;
        int third = 15;
        int expected = 20;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax20And11And18And22Then22() {
        int first = 20;
        int second = 11;
        int third = 18;
        int four = 22;
        int expected = 22;
        int out = Max.max(first, second, third, four);
        Assert.assertEquals(expected, out);
    }
}