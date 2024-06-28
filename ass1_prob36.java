import java.util.Scanner;

public class ass1_prob36 {
    static int Fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the nth Fibonacci number you want to know: ");
        int a = sc.nextInt();
        
        System.out.println(a + "th Fibonacci number is " + Fib(a));
    }
}
