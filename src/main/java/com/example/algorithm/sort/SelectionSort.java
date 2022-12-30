package com.example.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    /**
     * selection sort 선택정렬
     * desc
     *  모든 요소를 탐색하여 가장 작은 값을 앞으로 보낸다.
     *  요소를 탐색하며 작은 값이 와야 할 위치에 있는 요소와 자리를 바꾼다.
     *
     * 시간복잡도 O(n^2)
     *  n*(n+1) / 2 = n^2
     *      best : O(n^2)
     *      worst : O(n^2)
     *      avg : O(n^2)
     */

    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int temp = 0;
        for (int i = 0 ; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            temp =   arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(i-> System.out.print(i + " "));
    }
}
