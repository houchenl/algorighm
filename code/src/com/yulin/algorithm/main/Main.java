package com.yulin.algorithm.main;

import com.yulin.algorithm.other.MaximumCommonDivisor;
import com.yulin.algorithm.sort.BubbleSort;
import com.yulin.algorithm.tool.Tool;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        test();
        testBubbleSort();
    }

    private static void test() {
        int divisor = MaximumCommonDivisor.mcd(36, 24);
        System.out.println("max common divisor: " + divisor);
    }

    private static void testBubbleSort() {
        int[] array = Tool.getUnSortIntArray();
        Tool.printArray(array);
        BubbleSort.bubbleSort(array);
        Tool.printArray(array);
    }

}
