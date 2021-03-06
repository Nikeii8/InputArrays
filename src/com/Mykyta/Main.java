package com.Mykyta;


import java.util.Arrays;


import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getInt(4);

        int[] sorted = sortIntegers(myArray);
        printArray(sorted);

    }


    public static int[] getInt(int number) {
        System.out.println("Please enter " + number + " Integer values only.\r");

        int[] blablabla = new int[number];

        for (int i = 0; i < blablabla.length; i++) {
            blablabla[i] = scanner.nextInt();
        }

        return blablabla;

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }


        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
