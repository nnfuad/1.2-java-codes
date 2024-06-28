import java.util.Scanner;
public class ass1_prob30 {

    static void printri(int a){
        for(int i = 0 ; i<a ;i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int j = a ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        printri(a);
    }
}
