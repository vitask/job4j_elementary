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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int out = FindLoop.indexOfRange(data, el, start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDiapasonHasNot11ThenMinus1() {
        int[] data = new int[] {6, 2, 13, 9, 11, 3, 6, 9};
        int el = 11;
        int start = 0;
        int finish = 3;
        int expected = -1;
        int out = FindLoop.indexOfRange(data, el, start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDiapasonHas9Then0() {
        int[] data = new int[] {9, 7, 5, 3, 1};
        int el = 9;
        int start = 0;
        int finish = 2;
        int expected = 0;
        int out = FindLoop.indexOfRange(data, el, start, finish);
        Assert.assertEquals(expected, out);
    }
}