package com.yulin.algorithm.main;

import com.yulin.algorithm.other.MaximumCommonDivisor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        test();
    }

    private static void test() {
        int divisor = MaximumCommonDivisor.mcd(36, 24);
        System.out.println("max common divisor: " + divisor);
    }

}
