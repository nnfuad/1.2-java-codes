import java.util.Scanner;

public class lab1_prob4 {
    
    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

   
    static void printSpaces(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print(" ");
        }
    }

    
    static void printPascalPyramid(int rows) {
        
        for (int i = 0; i < rows; ++i) {
            printSpaces(rows - i - 1);
            for (int j = 0; j < 2 * i + 1; ++j) {
                int coef = binomialCoeff(i, Math.abs(j - i));
                if (coef != 0) {
                    System.out.print(coef + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int rowNumber = scanner.nextInt();

        System.out.println("Pascal's pyramid up to row " + rowNumber + ":");
        printPascalPyramid(rowNumber);
    }
}
