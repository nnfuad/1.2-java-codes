import java.util.Scanner;
public class ass1_prob24 {

    static void printTri(int a){
        for(int i = 1; i<=a ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int a = sc.nextInt();
        printTri(a);
    }
}
