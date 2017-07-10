import java.util.Scanner;

/**
 * Created by jenny on 7/9/2017.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String keepGoing = "y";
        double radius;

        System.out.println("Welcome to the Circle Tester");

        while(keepGoing.equalsIgnoreCase("y")) {
            System.out.print("Enter radius: ");
            radius = entry.nextInt();
            entry.nextLine();

            Circle circle1 = new Circle(radius);

            System.out.printf("Circumference: %.2f", circle1.getCircumference());

            System.out.printf("\nArea: %.2f", circle1.getArea());

            System.out.print("\nContinue? (y/n): ");
            keepGoing = entry.nextLine();
        }
        System.out.print("\nGoodbye.");
    }
}
