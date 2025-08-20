import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;

        System.out.println("Enter numbers (0 to stop):");
        while ((num = sc.nextInt()) != 0) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
