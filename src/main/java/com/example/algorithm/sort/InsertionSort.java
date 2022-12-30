package com.example.algorithm.sort;

import java.util.Arrays;

/**
 * Insertion Sort(삽입정렬)
 * desc
 *  항상 자신의 왼쪽에 있는 원소들은 정리가 되어있다고 생각하기 때문에, 왼쪽이 자기보다 작은 값인 경우 멈추면 된다.
 *  거의 정렬 된 상태라면 효율적인 알고리즘 -> 최선의 경우 예 ) {2,3,4,5,6,7,8,9,10,1} 인경우 n번의 비교와 n-1번의 교환이 일어난다.
 *  선택정렬, 버블정렬과 비교해서 같은 시간 복잡도를 가지지만, 연산이 적게 일어난다는 점에서 가장 효율적이다.
 *
 * 시간복잡도 O(n^2)
 *  n * (n+1) /2 = n^2
 *      best : O(n)
 *      worst : O(n^2)
 *      avg : O(n^2)
 *
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array =  {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for(int i=0; i < array.length; i++) {
            int temp = 0;
            int j = i;
           while (j<array.length -1 && array[j] > array[j+1]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
           }
        }
        Arrays.stream(array).forEach(i-> System.out.print(i+ " "));
    }
}
