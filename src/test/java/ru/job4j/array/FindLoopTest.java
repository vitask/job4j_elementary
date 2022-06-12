package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 4, 3, 2};
        int el = 5;
        int expected = 0;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenArrayHasNot13ThenMinus1() {
        int[] data = new int[] {11, 9, 1, 5, 7, 10};
        int el = 13;
        int expected = -1;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenArrayHas9Then2() {
        int[] data = new int[] {2, 3, 9, 10, 5};
        int el = 9;
        int expected = 2;
        int out = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, out);
    }
}