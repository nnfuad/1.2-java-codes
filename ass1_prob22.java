import java.util.Scanner;

public class ass1_prob22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        System.out.println("Number\tCube");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "\t" + cube);
        }
    }
}