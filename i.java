import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>(); // Change Queue type to Integer
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter integers as strings (type 'exit' to stop):");
            String x = sc.nextLine(); // Read input as String

            // Check exit condition
            if (x.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    int number = Integer.parseInt(x); // Convert String to Integer
                    que.add(number); // Add integer to the queue
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }
        }

        // Display stored integers
        System.out.println("\nStored integers:");
        for (int num : que) {
            System.out.println("Data is: " + num); // Display each integer
        }
    }
}
