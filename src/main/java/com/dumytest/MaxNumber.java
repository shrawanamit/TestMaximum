package com.dumytest;

public class MaxNumber {
    Integer x,y,z;
    Double a,b,c;
    String s,s1,s2;

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

    public MaxNumber(String s, String s1, String s2) {
        this.s = s;
        this.s1 = s1;
        this.s2 = s2;
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

    public String validateMaxString() {
        String max;
        if (s.compareTo(s1) > 0 && s.compareTo(s2) > 0) {
            max = s;
        } else if(s1.compareTo(s) > 0 && s.compareTo(s2) > 0){
            max=s1;
        }else{
            max=s2;
        }
        return max;
    }
}
