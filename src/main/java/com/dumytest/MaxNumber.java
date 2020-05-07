package com.dumytest;

public class MaxNumber {
    Integer x,y,z;
    Double a,b,c;

    public MaxNumber(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MaxNumber(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public Double validateMaxDouble() {
        Double max;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        } else if(b.compareTo(a) > 0 && b.compareTo(c) > 0){
            max=b;
        }else{
            max=c;
        }
        return max;
    }
}
