package ru.skypro;

import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[38];
        for (int i =0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= generateRandomArray();
        System.out.println("Наш массив");
        System.out.println(Arrays.toString(arr));

        float allSum = 0;
        for (int i : arr) {
            allSum +=i;
        }
        System.out.println("Сумма трат за месяц составила " + allSum + " руюлей");
    }
}
