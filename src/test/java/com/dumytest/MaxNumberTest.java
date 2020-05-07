package com.dumytest;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void testinteger() {
        Integer max1=15;
        MaxNumber maxnumber=new MaxNumber(15,12,13);
        maxnumber.validateMax();
        Assert.assertEquals(max1,maxnumber.max);
    }
    @Test
    public void testDouble() {
        Double max1=15.2;
        MaxNumber maxnumber=new MaxNumber(15.2,12.3,13.3);
        maxnumber.validateMax();
        Assert.assertEquals(max1,maxnumber.max);
    }
    @Test
    public void testString() {
        String max1="vinit";
        MaxNumber maxnumber=new MaxNumber("amit","sumit","vinit");
        maxnumber.validateMax();
        Assert.assertEquals(max1,maxnumber.max);
    }

}
