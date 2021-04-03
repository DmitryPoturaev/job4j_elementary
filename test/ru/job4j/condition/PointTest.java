package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        int expected = 2;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when36to159then12() {
        Point point1 = new Point(3, 6);
        Point point2 = new Point(15, 9);
        double expected = 12.36;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when36787to35238then364() {
        Point point1 = new Point(367, 87);
        Point point2 = new Point(35, 238);
        double expected = 364.72;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when224to859then8() {
        Point point1 = new Point(2, 2, 4);
        Point point2 = new Point(8, 5, 9);
        double expected = 8.36;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when506to359then6() {
        Point point1 = new Point(5, 0, 6);
        Point point2 = new Point(3, 5, 9);
        double expected = 6.16;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}