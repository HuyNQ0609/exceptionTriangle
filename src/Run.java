import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle;
        try {
            System.out.print("Enter a: ");
            double a = input.nextDouble();
            System.out.print("Enter b: ");
            double b = input.nextDouble();
            System.out.print("Enter c: ");
            double c = input.nextDouble();
            triangle = new Triangle(a, b, c);
            System.out.println("Perimeter of Triangle = " + triangle.getPerimeter());
            System.out.print("Area of Triangle = " + triangle.getArea());
        } catch (InputMismatchException e) {
            System.out.println("The input value must be a real number");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
