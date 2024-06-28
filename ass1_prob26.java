import java.util.*;
public class ass1_prob26 {
    static void pyra(int a){
        for (int i = 1; i <= a; i++) {

            for (int j = i; j < a; j++) {
                System.out.print(" ");
        }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int a = sc.nextInt();
        pyra(a);
    }
}