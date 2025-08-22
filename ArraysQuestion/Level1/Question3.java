// Create a program to print a multiplication table of a number.

package BridgeLabzPPP.ArraysQuestion.Level1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();
        int multiplicationTable[] = new int[10];
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }
        for (int i = 1; i <=10; i++) {
            System.out.println(number + " x " + i + " = " + (multiplicationTable[i - 1]));
        }
    }
}
