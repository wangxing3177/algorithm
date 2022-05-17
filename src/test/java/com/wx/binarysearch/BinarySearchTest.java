package com.wx.binarysearch;

/**
 * Created by 王兴
 * 2022/5/17 22:33
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int num = 9;
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(array, num);
    }
}
