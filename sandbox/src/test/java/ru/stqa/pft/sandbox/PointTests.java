package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testArea() {
        Point pa = new Point(1,1);
        Point pb = new Point(5,4);
        Assert.assertEquals(pa.calcDistance(pb),5.0);
    }
}
