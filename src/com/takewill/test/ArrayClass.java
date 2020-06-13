package com.takewill.test;

public class ArrayClass {

    int[] array = new int[10];

    public static void main(String[] args) {
        int [] array2 = {0,1,2,3,4,5,8,7,8,15};
        for (int ind = array2.length-1; ind >= 0; ind-- ){
         System.out.println(array2[ind]);
        }
    }
}