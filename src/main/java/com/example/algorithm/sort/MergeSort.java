package com.example.algorithm.sort;

public class MergeSort {

    static int[] sorted = new int[10];
    public static void main(String[] args) {
        int[] array = {2,3,4,6,5,7,8,9,1};
        mergeSort(array, 0, array.length-1);
        for (int n : array) {
            System.out.print(n + ",");
        }
    }
    public static void mergeSort(int[] array, int n, int m) {
        if (n < m) {
            int middle = (m+n)/2;
            mergeSort(array, n, middle);
            mergeSort(array, middle+1, m);
            merge(array, n, middle, m);
        }
    }

    public static void merge(int[] array, int n, int middle, int m) {

        int i = n;
        int j = middle + 1;
        int k = n;

        while (i <= middle && j <= m ) {
            if (array[i] <= array[j]) {
                sorted[k] = array[i];
                i++;
            } else {
                sorted[k] = array[j];
                j++;
            }
            k++;
        }

        if (i > middle) {
            for (int t = j ; t <= m; t++) {
                sorted[k] = array[t];
                k++;
            }
        }

        if (j > m) {
            for (int t=i; t <= middle; t++) {
                sorted[k] = array[t];
                k++;
            }
        }

        for(int t = n; t<m; t++) {
            array[t] = sorted[t];
        }


    }
}
