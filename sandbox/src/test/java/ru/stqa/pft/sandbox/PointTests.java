package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    Point pa = new Point(1,1);
    Point pb = new Point(5,4);

    @Test
    public void testArea() {
        Assert.assertEquals(pa.calcDistance(pb),5.0);
    }

    @Test
    public void notNegativ() {
        Assert.assertFalse(pa.calcDistance(pb)<0);
    }

    @Test
    public void triangleTheorem() {
        int sum = Math.abs(pa.x-pb.x) + Math.abs(pa.y-pb.y);
        Assert.assertFalse(sum<=pa.calcDistance(pb));
    }

}
