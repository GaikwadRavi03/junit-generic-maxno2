package com.bridgelabz;

public class MaximumNumber {
    Integer d;

    public Integer getMaxNumber(Integer a, Integer b, Integer c) {
        d = (a.toString().compareTo(b.toString()) > 0 ? (a.toString().compareTo(c.toString()) > 0 ? a : c)
                : (b.toString().compareTo(c.toString()) > 0 ? b : c));
        return d;
    }
}
