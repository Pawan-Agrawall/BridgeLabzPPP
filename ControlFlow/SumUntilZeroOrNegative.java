import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;

        System.out.println("Enter numbers (stop at 0 or negative):");
        while (true) {
            num = sc.nextInt();
            if (num <= 0) break;
            sum += num;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
