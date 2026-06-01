package sjuJavaprojects;
import java.util.Scanner;

public class RunStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values are in the dataset? ");
        int size = input.nextInt();

        double[] values = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = input.nextDouble();
        }

        Stats stats = new Stats(values);

        System.out.println("\nStatistics:");
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
        System.out.println("Minimum: " + stats.min());
        System.out.println("Maximum: " + stats.max());
        System.out.println("Standard Deviation: " + stats.standardDev());

        
    }
}
