import java.util.Scanner;

public class FindCircleAreaAndCircumference{
    public static void main(String[] args) {
        double radius;
        double area, circumference;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}
