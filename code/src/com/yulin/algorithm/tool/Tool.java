package com.yulin.algorithm.tool;

public class Tool {

    /**
     * 交换整形数组中序号为i和j的两个数
     * */
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * 返回待排序数组
     * */
    public static int[] getUnSortIntArray() {
        return new int[]{3, 5, 1, 2, 7, 9, 4, 10, 22, 32, 17, 88, 31, 23};
    }

    /**
     * 打印数组
     * */
    public static void printArray(int[] array) {
        if (null == array || array.length < 1) return;

        System.out.print("{");
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }

}
