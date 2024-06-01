import java.util.Scanner;

public class PatternAscending {

    public static void printPatterns(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    };

    public static void main(String[] args) {
        int INVALID_INPUT = -1;
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
        scanner.close();
        System.out.println();
        printPatterns(patternSize);
        System.out.println();
    }
}
