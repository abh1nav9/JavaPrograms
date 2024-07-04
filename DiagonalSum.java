import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows of the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Compute sum of primary diagonal
        int primaryDiagonalSum = 0;
        for (int i = 0; i < rows && i < columns; i++) {
            primaryDiagonalSum += matrix[i][i];
        }

        // Compute sum of secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < rows && i < columns; i++) {
            secondaryDiagonalSum += matrix[i][columns - 1 - i];
        }

        // Print the results
        System.out.println("Sum of the primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }
}
