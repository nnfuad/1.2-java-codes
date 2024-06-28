import java.util.Scanner;
public class ass1_prob34 {
    static int fact(int a ){
        if(a == 0 || a==1) return 1;
         return a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number you want to calculate the factorial of: ");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+" is "+fact(a));
    }
}