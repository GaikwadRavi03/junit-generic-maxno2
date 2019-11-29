package com.bridgelabz;

public class MaximumNumber<T> {
    T d;

    public static <T> T getMaxNumber(T a, T b, T c) {
        T d = (a.toString().compareTo(b.toString()) > 0 ? (a.toString().compareTo(c.toString()) > 0 ? a : c)
                : (b.toString().compareTo(c.toString()) > 0 ? b : c));
        return d;
    }
}
