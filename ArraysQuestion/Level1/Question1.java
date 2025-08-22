// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
package BridgeLabzPPP.ArraysQuestion.Level1;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(ages[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with the age "+ages[i]+" can vote");
            } else {
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
        }

        scanner.close();
    }
}