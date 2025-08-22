// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

package BridgeLabzPPP.ArraysQuestion.Level1;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4]; 

        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            multiplicationResult[i] = number * multiplier;
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        scanner.close();
    }
}
