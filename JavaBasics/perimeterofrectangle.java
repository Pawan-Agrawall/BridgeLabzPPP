import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        double length, breadth, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble(); 
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = input.nextDouble(); 
        perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }
}
