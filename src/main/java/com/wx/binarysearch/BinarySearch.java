package com.wx.binarysearch;

/**
 * Created by 王兴
 * 2022/5/17 22:18
 *
 * 二分查找
 */
public class BinarySearch {

    public void search(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        int middle = 0;
        while (true) {
            if (left > right) {
                System.out.println("未找到！");
                break;
            }
            middle = (right + left) / 2;
            if (array[middle] > num) {
                right = middle - 1;
            } else if (array[middle] < num) {
                left = middle + 1;
            } else if (array[middle] == num) {
                System.out.println("元素在数组的第" + middle + "位！");
                break;
            }
        }

    }
}
