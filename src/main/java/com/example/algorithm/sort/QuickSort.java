package com.example.algorithm.sort;

import java.util.Arrays;

/**
 * Quick sort (퀵 정렬)
 * desc
 *  피벗값(기준값)을 선택
 *  피벗값 이후의 요소들을 오른쪽으로 탐색하여 피벗값보다 큰 값을 선택
 *  피벗값 이후의 요소들을 왼쪽으로 탐색하여 피벗값보다 작은 값을 선택
 *  큰 값과 작은 값의 위치를 변경한다.
 *  변경하면서 큰 값과 작은 값의 인덱스가 변경 되면 피벗값과 작은값의 위치를 변경한다.
 *  변경 후 피벗값을 기준으로 왼쪽과 오른쪽을 나누어 다시 퀵정렬을 실행한다.
 *
 *  시간복잡도 O(nlog2n)
 *      best : O(nlog2n)
 *      worst : n^2
 *      avg : O(nlog2n)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array =  {7, 10, 5, 8, 1, 6, 4, 3, 9, 2};
        quickSort(array, 0, array.length-1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = start;
        int left = start+1;
        int right = end;

        while (left <= right) {
            while(array[pivot] >= array[left]) {
                left++;
            }
            while(right > start && array[pivot] < array[right]) {
                right--;
            }
            //엇갈리지 않은 경우는 left와 right의 자리를 변경
            if (left < right) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            //엇갈린 경우는 pivot과 right 자리를 변경
            } else {
                int temp = array[right];
                array[right] = array[pivot];
                array[pivot] = temp;
            }
        }
        //pivot을 기준으로 왼쪽 배열 정렬
        quickSort(array, start, right-1);
        //pivot을 기준으로 오른쪽 배열 정렬
        quickSort(array, right+1, end);
    }

}
