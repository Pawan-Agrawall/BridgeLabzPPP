import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (<100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Multiples below 100:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0)
                    System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
