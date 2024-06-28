import java.util.Scanner;
public class ass1_prob33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();
        if(a<=b && b<=c) System.out.println("Increasing order");
         else if (a>=b && b>=c) System.out.println("Decreasing order");
         else System.out.println("Neither increasing or decreasing order");
    }
}
