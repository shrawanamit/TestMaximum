package com.dumytest;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    @Test
    public void testinteger() {
        Integer max=15;
        MaxNumber maxnumber=new MaxNumber(15,12,13);
        Integer result=maxnumber.validateMaxIntger();
        Assert.assertEquals(max,result);
    }
    @Test
    public void testDouble() {
        Double max=15.2;
        MaxNumber maxnumberdouble=new MaxNumber(15.2,12.3,13.3);
        Double result=maxnumberdouble.validateMaxDouble();
        Assert.assertEquals(max,result);
    }

}
