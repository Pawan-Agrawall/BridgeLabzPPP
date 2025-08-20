import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (<100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
        } else {
            int counter = 1;
            System.out.println("Multiples below 100:");
            while (counter < 100) {
                if (counter % number == 0)
                    System.out.print(counter + " ");
                counter++;
            }
        }
        sc.close();
    }
}
