import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read the first number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read the second number
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble(); // Read the third number
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average of the three numbers is: " + average);

    }
}