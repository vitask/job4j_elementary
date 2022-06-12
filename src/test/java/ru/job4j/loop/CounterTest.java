package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumberFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumberFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumberFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}
