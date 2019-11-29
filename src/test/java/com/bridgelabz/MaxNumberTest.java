package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class MaxNumberTest {
    @Test
    public void givenMaxNumberAt_1stPosition_ShouldReturn_theSameNumberForInteger() {
        MaximumNumber m1 = new MaximumNumber();
        Integer result = m1.getMaxNumber(40, 20, 30);
        Assert.assertEquals(Integer.valueOf(40), result);
    }

    @Test
    public void givenMaxNumberAt_2ndPosition_ShouldReturn_theSameNumberForInteger() {
        MaximumNumber m1 = new MaximumNumber();
        Integer result = m1.getMaxNumber(10, 40, 30);
        Assert.assertEquals(Integer.valueOf(40), result);
    }

    @Test
    public void givenMaxNumberAt_3rd_Position_ShouldReturn_theSameNumberForInteger() {
        MaximumNumber m1 = new MaximumNumber();
        Integer result = m1.getMaxNumber(10, 20, 30);
        Assert.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    public void givenMaxNumberAt_1stPosition_ShouldReturn_theSameNumberForFloat() {
        MaximumNumber m1 = new MaximumNumber();
        Float result = m1.getMaxNumber(40.10f, 20.10f, 30.10f);
        Assert.assertEquals(Float.valueOf(40.10f), result);
    }

    @Test
    public void givenMaxNumberAt_2nd_Position_ShouldReturn_theSameNumberForFloat() {
        MaximumNumber m1 = new MaximumNumber();
        Float result = m1.getMaxNumber(10.10f, 40.10f, 30.10f);
        Assert.assertEquals(Float.valueOf(40.10f), result);
    }
}
