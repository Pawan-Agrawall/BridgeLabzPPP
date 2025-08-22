// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

package BridgeLabzPPP.ArraysQuestion.Level1;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    for (int j = 0; j < 5; j++){
        System.out.print("Enter number " + (j + 1) + ": ");
        numbers[j] = scanner.nextInt();
    }
    for (int i = 0; i < 5; i++) {
        if (numbers[i] > 0) {
            if (numbers[i] % 2 == 0) {
                System.out.println("The number " + numbers[i] + " is positive and even");
            } else {
                System.out.println("The number " + numbers[i] + " is positive and odd");
            }
        } 
        else if (numbers[i] < 0) {
            System.out.println("The number " + numbers[i] + " is negative");
        }
        else {
            System.out.println("The number is zero");
        }
    }
    if (numbers[0] == numbers[4]) {
        System.out.println("The first and last elements are equal");
    } 
    else if (numbers[0] > numbers[4]) {
        System.out.println("The first element is greater than the last element");
    } 
    else {
        System.out.println("The first element is less than the last element");
    }
    scanner.close();
}
}
