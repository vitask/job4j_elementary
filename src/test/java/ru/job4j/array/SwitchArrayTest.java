package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0To4() {
        int[] input = {2, 3, 5, 1, 7};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 3, 5, 1, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3To4() {
        int[] input = {1, 5, 9, 2, 3, 8, 10, 4};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 9, 3, 2, 8, 10, 4};
        Assert.assertArrayEquals(expected, result);
    }
}