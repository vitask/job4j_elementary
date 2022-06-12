package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] expected = new int[] {0, 1, 4};
        int[] out = Square.calculate(bound);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] expected = new int[] {0, 1, 4, 9};
        int[] out = Square.calculate(bound);
        Assert.assertArrayEquals(expected, out);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] out = Square.calculate(bound);
        Assert.assertArrayEquals(expected, out);
    }
}