import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double radius= sc.nextInt();
        double area=(3.14)*(radius*radius);
        System.out.println("The Area of the Circle is: "+area);
    }
}
