package com.wx.insertsort;

/**
 * Created by 王兴
 * 2022/5/19 1:02
 *
 * 插入排序
 */
public class InsertSort {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }

        }
    }
}
