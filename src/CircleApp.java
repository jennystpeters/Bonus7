import java.util.Scanner;

/**
 * Created by jenny on 7/9/2017.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String keepGoing = "y";

        System.out.println("Welcome to the Circle Tester");

        while (keepGoing.equalsIgnoreCase("y")) {

            Circle circle1 = new Circle(getRadius(entry));
            entry.nextLine();

            System.out.print("Circumference: " + circle1.getFormattedCircumference());

            System.out.print("\nArea: " + circle1.getFormattedArea());

            System.out.print("\nContinue? (y/n): ");
            keepGoing = entry.nextLine();
        }
        System.out.print("\nGoodbye.");
    }

    private static double getRadius(Scanner entry) {
        System.out.print("Enter radius: ");
        return entry.nextInt();
    }
}
