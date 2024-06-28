import java.util.Scanner;

public class lab1_prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

        if (col1 != row2) {
            System.out.println("Cannot multiply the matrices. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        int[][] res = new int[row1][col2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col1; ++j) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row2; ++i) {
            for (int j = 0; j < col2; ++j) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col2; ++j) {
                res[i][j] = 0;
                for (int k = 0; k < col1; ++k) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < row1; ++i) {
            for (int j = 0; j < col2; ++j) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
