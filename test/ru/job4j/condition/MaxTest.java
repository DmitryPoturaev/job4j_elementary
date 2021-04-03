package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4To6Then6() {
        int first = 5;
        int second = 4;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To7To8To9Then9() {
        int first = 6;
        int second = 7;
        int third = 8;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}