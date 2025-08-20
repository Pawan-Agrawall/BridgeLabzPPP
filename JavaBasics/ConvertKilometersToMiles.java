import java.util.Scanner;

public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); 
        System.out.print("Enter distance in kilometers: "); 
        double kilometers = inputScanner.nextDouble(); 
        // Conversion factor: 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;

        System.out.printf("%.2f kilometers is equal to %.2f miles%n", kilometers, miles); // Display the converted distance, formatted to two decimal places

    }
}
