import java.util.Scanner;

public class ass1_prob35 {
    static int Sum(int[] b, int n) {
        if (n <= 0) {
            return 0;
        }
        return b[n - 1] + Sum(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input how many numbers you want to calculate the sum of: ");
        int a = sc.nextInt();
        int[] b = new int[a];
        System.out.print("Input the numbers: ");
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Sum of the numbers is " + Sum(b, b.length));
        sc.close();
    }
}