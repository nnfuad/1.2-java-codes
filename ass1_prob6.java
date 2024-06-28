import java.util.Scanner;
public class ass1_prob6 {

    static int sumOfDigits(int number) {
        int sum = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
}