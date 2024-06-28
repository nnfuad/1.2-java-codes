import java.util.Scanner;
public class ass1_prob21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input another floating-point number: ");
        double num2 = scanner.nextDouble();
        
       
        double decplace = 0.001;
        
        if (Math.abs(num1 - num2) < decplace) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
