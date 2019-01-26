package com.yulin.algorithm.sort;

import com.yulin.algorithm.tool.Tool;

/**
 * 冒泡排序
 * */
public class BubbleSort {

    /**
     * 冒泡排序，从小到大
     * */
    public static void bubbleSort(int[] array) {
        if (null == array || array.length < 2) {
            return;
        }

        for (int end = array.length - 1; end > 0; end--) {
            for (int j = 0; j < end; j++) {
                if (array[j] > array[j + 1])
                    Tool.swap(array, j, j + 1);
            }
        }
    }

}
