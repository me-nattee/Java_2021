package ru.autoqa.Java2021.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class PointTests {
    @Test

    public void testPoint(){
        Point p1 = new Point(5,7);
        Point p2 = new Point(2,3);
        Assert.assertEquals(p1.distance(p2), 5.0,0);
    }

    @Test
    public void testPoint2(){
        Point p1 = new Point(5,7);
        Point p2 = new Point(2,7);
        Assert.assertEquals(p1.distance(p2), 5.0,0);
    }

    @Test
    public void testPoint3(){
        Point p1 = new Point(5,7);
        Point p2 = new Point(5,7);
        Assert.assertEquals(p1.distance(p2), 2.0,3);
    }
}
