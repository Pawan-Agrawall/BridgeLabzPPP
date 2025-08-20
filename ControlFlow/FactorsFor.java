import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Factors:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
