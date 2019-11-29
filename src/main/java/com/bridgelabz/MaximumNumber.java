package com.bridgelabz;

import java.util.Arrays;

public class MaximumNumber<T> {
    T a;
    T b;
    T c;

    public MaximumNumber() {
    }

    public MaximumNumber(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <T extends Comparable> T getMaxNumber(T a, T b, T c) {
        T d = (a.toString().compareTo(b.toString()) > 0 ? (a.toString().compareTo(c.toString()) > 0 ? a : c)
                : (b.toString().compareTo(c.toString()) > 0 ? b : c));
        return d;
    }

    public <T> T getMaxNumber() {
        T result = (T) getMaxNumber(this.a, this.b, this.c);
        return result;
    }

    private T getMaxNumber(T a, T b, T c) {
        T d = (a.toString().compareTo(b.toString()) > 0 ? (a.toString().compareTo(c.toString()) > 0 ? a : c)
                : (b.toString().compareTo(c.toString()) > 0 ? b : c));
        return d;
    }

    public static <T> T getMaxNumber(T... params) {
        Arrays.sort(params);
        return params[params.length - 1];
    }

}
