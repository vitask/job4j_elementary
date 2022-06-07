package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax12To5Then12() {
        int left = 12;
        int right = 5;
        int expected = 12;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax7To7The7() {
        int left = 8;
        int right = 8;
        int expected = 8;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax3To9Then9() {
        int left = 3;
        int right = 9;
        int expected = 9;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}