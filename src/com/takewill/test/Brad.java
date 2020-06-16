package com.takewill.test;

public class Brad {
    public static void main(String[] args) {
        int numarulDeRanduri = (int) (Math.random() * (10 - 2)) + 2;
        for (int i = 0; i < numarulDeRanduri; i++) {
            for (int j = 0; j < numarulDeRanduri - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}