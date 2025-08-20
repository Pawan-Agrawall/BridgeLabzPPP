import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input.");
        } else {
            int i = 1;
            System.out.println("Factors:");
            while (i <= number) {
                if (number % i == 0)
                    System.out.print(i + " ");
                i++;
            }
        }
        sc.close();
    }
}
