import java.util.Scanner;
public class ass1_prob32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();
        if(a != b && b!=c && c!=a) System.out.println("All numbers are different");
         else if (a==b && b==c && c==a) System.out.println("All numbers are equal");
         else System.out.println("Neither all are equal or different");
    }
}
