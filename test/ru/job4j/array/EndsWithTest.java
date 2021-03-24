package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'o', 'l'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'i', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}