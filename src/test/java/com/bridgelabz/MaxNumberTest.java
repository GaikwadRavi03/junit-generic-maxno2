package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void givenMaxNumberat_1stPosition_ShouldReturn_theSameNumber() {
        MaximumNumber m1 = new MaximumNumber();
        Object result = m1.getMaxNumber(40, 20, 30);
        Assert.assertEquals(Integer.valueOf(40), result);
    }
}
