import java.util.Scanner;

public class Pattern_1_Square {

    private static final int INVALID_INPUT = 0;

    public static void printSquarePattern(int patternSize) {
        for (int i = 0; i < patternSize; i++) {
            for (int j = 0; j < patternSize; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int patternSize = -1;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the pattern size (positive integer): ");
            if (scanner.hasNextInt()) {
                patternSize = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Consume invalid input
            }
        } while (patternSize <= INVALID_INPUT);

        System.out.println();
        printSquarePattern(patternSize);
        System.out.println();

        scanner.close();
    }
}
