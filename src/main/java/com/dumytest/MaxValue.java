package com.dumytest;
import java.util.*;

public class MaxValue<T extends Comparable<? super T> > {
    private  ArrayList<T> list=null;
    public MaxValue(ArrayList<T> list) {
        this.list=list;

    }

    public T  validateMax() {
        return  validateMax(this.list);
    }


    public <T extends Comparable> T validateMax(ArrayList<T> list){
        T max= list.get(0);
        for(T element:list) {
            max = (element.compareTo(max) > 0) ? element : max;
        }
        printGenerics(max);
        return max;
    }
    private <T extends Comparable> void printGenerics(T max) {
        System.out.println("Maximum of "+ this.list +" is :"+max);
    }

}
