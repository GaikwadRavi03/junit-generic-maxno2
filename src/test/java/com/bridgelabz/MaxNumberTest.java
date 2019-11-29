package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void givenMaxNumberAt_1stPosition_ShouldReturn_theSameNumber() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(40, 20, 30);
        Assert.assertEquals(Integer.valueOf(40), result);
    }

    @Test
    public void givenMaxNumberAt_2ndPosition_ShouldReturn_theSameNumber() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(10, 40, 30);
        Assert.assertEquals(Integer.valueOf(40), result);
    }

    @Test
    public void givenMaxNumberAt_3rd_Position_ShouldReturn_theSameNumber() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(10, 20, 30);
        Assert.assertEquals(Integer.valueOf(30), result);
    }
}
