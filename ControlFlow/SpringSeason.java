import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month >= 3 && month <= 5)
            System.out.println("It's Spring season!");
        else
            System.out.println("Not Spring season.");

        sc.close();
    }
}
