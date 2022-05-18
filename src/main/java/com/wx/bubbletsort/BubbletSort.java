package com.wx.bubbletsort;

/**
 * Created by 王兴
 * 2022/5/19 0:45
 *
 * 冒泡排序
 */
public class BubbletSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array [j]) {
                    array[j] = array[j + 1] + array[j];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }

    }
}
