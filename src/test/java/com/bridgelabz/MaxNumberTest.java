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

    @Test
    public void givenMaxNumberAt_3rd_Position_ShouldReturn_theSameNumberForFloat() {
        MaximumNumber m1 = new MaximumNumber();
        Float result = m1.getMaxNumber(10.10f, 20.10f, 40.10f);
        Assert.assertEquals(Float.valueOf(40.10f), result);
    }

    @Test
    public void givenMaxNumberAt_1stPosition_ShouldReturn_theSameNumberForString() {
        MaximumNumber m1 = new MaximumNumber();
        String result = m1.getMaxNumber("CCC", "BBB", "AAA");
        Assert.assertEquals(String.valueOf("CCC"), result);
    }

    @Test
    public void givenMaxNumberAt_2nd_Position_ShouldReturn_theSameNumberForString() {
        MaximumNumber m1 = new MaximumNumber();
        String result = m1.getMaxNumber("BBB", "CCC", "AAA");
        Assert.assertEquals(String.valueOf("CCC"), result);
    }

    @Test
    public void givenMaxNumberAt_3rd_Position_ShouldReturn_theSameNumberForString() {
        MaximumNumber m1 = new MaximumNumber();
        String result = m1.getMaxNumber("AAA", "BBB", "CCC");
        Assert.assertEquals(String.valueOf("CCC"), result);
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_Integer() {
        MaximumNumber m1 = new MaximumNumber(10, 20, 30);
        Assert.assertEquals(30, m1.getMaxNumber());
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_Float() {
        MaximumNumber m1 = new MaximumNumber(10.10, 20.10, 30.10);
        Assert.assertEquals(30.10, m1.getMaxNumber());
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_String() {
        MaximumNumber m1 = new MaximumNumber("AAA", "BBB", "CCC");
        Assert.assertEquals("CCC", m1.getMaxNumber());
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_Integer_MoreThan3_Parameters() {
        MaximumNumber m1 = new MaximumNumber();
        Integer result = m1.getMaxNumber(10, 20, 30, 40, 50, 60);
        Assert.assertEquals(Integer.valueOf(60), result);
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_Float_MoreThan3_Parameters() {
        MaximumNumber m1 = new MaximumNumber();
        Float result = m1.getMaxNumber(10.10f, 20.10f, 30.10f, 40.10f, 50.10f, 60.10f);
        Assert.assertEquals(Float.valueOf(60.10f), result);
    }

    @Test
    public void givenMaxNumber_ShouldReturn_theSameNumberGenerics_String_MoreThan3_Parameters() {
        MaximumNumber m1 = new MaximumNumber();
        String result = m1.getMaxNumber("AAA", "BBB", "CCC", "DDD", "EEE");
        Assert.assertEquals(String.valueOf("CCC"), result);
    }

}
