package com.takewill.test;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, -5, 12, 5, 1, 0};
        sortAsc(array);
        print(array);

        sortDesc(array);
        print(array);
    }

    public static int[] sortAsc(int[] arrA) {
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int j = 0; j < arrA.length - 1 - i; j++) {
                if (arrA[j] > arrA[j + 1]) {
                    int temp = arrA[j + 1];
                    arrA[j + 1] = arrA[j];
                    arrA[j] = temp;
                }
            }
        }
        return arrA;
    }

    public static int[] sortDesc(int[] arrB) {
        for (int i = 0; i < arrB.length - 1; i++) {
            for (int j = 0; j < arrB.length - 1 - i; j++) {
                if (arrB[j] < arrB[j + 1]) {
                    int temp = arrB[j + 1];
                    arrB[j + 1] = arrB[j];
                    arrB[j] = temp;
                }
            }
        }
        return arrB;
    }

    public static void print(int[] arr) {
        System.out.print("Array sorted: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ ", ");
            }
    }
}