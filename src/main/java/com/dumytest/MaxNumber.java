package com.dumytest;

public class MaxNumber {
    Integer x,y,z;

    public MaxNumber(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer validateMaxIntger() {
        Integer max;
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            max = x;
        } else if(y.compareTo(x) > 0 && y.compareTo(z) > 0){
            max=y;
        }else{
            max=z;
        }
        return max;
    }
}
