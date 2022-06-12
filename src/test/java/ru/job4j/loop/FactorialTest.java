package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int n = 5;
        int expected = 120;
        int out = Factorial.sum(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int expected = 1;
        int out = Factorial.sum(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialFor1Then1() {
        int n = 1;
        int expected = 1;
        int out = Factorial.sum(n);
        Assert.assertEquals(expected, out);
    }
}