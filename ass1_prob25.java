import java.util.Scanner;
public class ass1_prob25 {
    static void printTriangle(int a ){
        for(int i = 1 ; i<=a ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int a = sc.nextInt();
        printTriangle(a);

    }
}