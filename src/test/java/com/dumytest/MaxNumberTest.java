package com.dumytest;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
    MaxValue maxValue;
    @Test
    public void returnMaxInteger_if_largest_integer_at_begining() {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3,2,0,1));
        maxValue =new MaxValue(list);
        Integer max= (Integer) maxValue.validateMax();
        Assert.assertEquals(3,max.intValue());
    }
    public void returnMaxInteger_if_largest_integer_at_middle() {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,3,0,1));
        maxValue =new MaxValue(list);
        Integer max= (Integer) maxValue.validateMax();
        Assert.assertEquals(3,max.intValue());
    }

    public void returnMaxInteger_if_largest_integer_at_end() {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,1,0,3));
        maxValue =new MaxValue(list);
        Integer max= (Integer) maxValue.validateMax();
        Assert.assertEquals(3,max.intValue());
    }


    @Test
    public void returnMaxDouble_if_largest_float_at_begining() {
        ArrayList<Float> list=new ArrayList<Float>(Arrays.asList(3.2f,1.0f,2.6f,0.2f));
        maxValue =new MaxValue(list);
        Float max= (Float)  maxValue.validateMax();
        Assert.assertEquals(3.2f,max,0.0f);
    }
    @Test
    public void  returnMaxString_if_largest_String_at_begining() {
        ArrayList<String> list=new ArrayList<String>(Arrays.asList("Peach","Apple","Banana","Mango"));
        maxValue =new MaxValue(list);
        String max= (String) maxValue.validateMax();
        Assert.assertEquals("Peach",max);
    }

}
