import java.util.Scanner;
public class ass1_prob23 {
    static void printTable(int a ){
        for(int i = 1 ; i<=10 ; i++){
            System.out.printf("%d\tx\t%d\t=\t%d\n",a,i,a*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        printTable(a);
    }
}