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
}
