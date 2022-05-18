package com.wx.insertsort;

import java.util.Arrays;

/**
 * Created by 王兴
 * 2022/5/19 1:12
 */
public class InsertSortTest {

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] array = {3,6,2,3,2,1,8,9,4,0,4,1};
        System.out.println(Arrays.toString(array));
        insertSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
