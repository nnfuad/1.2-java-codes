import java.util.Scanner;

public class Ass1Prob19 {

    static void isPos(double a) {
        if (a < 0) {
            System.out.println("Number is negative");
        } else if (a > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }

        if (Math.abs(a) < 1 && Math.abs(a) != 0) {
            System.out.println("(Short)");
        } else if (Math.abs(a) > 1000000) {
            System.out.println("(Long)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        double a = sc.nextDouble();
        isPos(a);
        sc.close();
    }
}
