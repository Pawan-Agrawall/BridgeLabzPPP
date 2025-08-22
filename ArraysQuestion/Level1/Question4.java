// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 

package BridgeLabzPPP.ArraysQuestion.Level1;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0 || count == 10) {
                break;
            }
            numbers[count] = input;
            count++;
        }
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all numbers: " + sum);
        scanner.close();
    }
}
