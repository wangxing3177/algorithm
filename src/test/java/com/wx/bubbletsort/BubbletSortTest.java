package com.wx.bubbletsort;

import java.util.Arrays;

/**
 * Created by 王兴
 * 2022/5/19 0:55
 */
public class BubbletSortTest {

    public static void main(String[] args) {
        BubbletSort bubbletSort = new BubbletSort();
        int[] array = {3,6,2,3,2,1,8,9,4,0,4,1};
        bubbletSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
