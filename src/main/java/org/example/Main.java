package org.example;

import java.util.Scanner;

public class Main {

    // Method to find the index of the smallest element in an array of doubles
    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        // Read ten numbers from the user
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Find and display the index of the smallest element
        System.out.println("The index of the smallest element is: " + indexOfSmallestElement(numbers));

        input.close();
    }
}