package com.example.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * Bubble sort (버블 정렬)
     * desc
     *  옆자리 요소와 비교하여 작은값이라면 자리를 교환한다.
     *  선택정렬과 동일 한 시간복잡도를 가지고 있지만, 버블정렬을 교환이 계속 일어난다는 점에서 선택정렬보다 비효율적이다.
     *
     * 시간복잡도 O(n^2)
     *  n*(n+1)/2 = n^2
     *      best : n^2
     *      worst : n^2
     *      avg : n^2
     */

    public static void main(String[] args) {
        int[] array =  {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i=0; i<array.length; i++) {
            int minIndex = i;
            int temp;
            for(int j= i +1; j<array.length - i; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(i-> System.out.println(i+ " "));
    }
}
