import java.util.Scanner;
import java.math.*;

public class ass1_prob7 {
    static void futInvVal(double a, double b, double c){
        double monthlyRate = b / (12 * 100);
        //int val = a * (Math.pow((1+(b/12)),(12*c)));
        double futureValue = a * (Math.pow((1 + monthlyRate), (12 * c)));
        System.out.printf("%.2f\n",futureValue);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        int a = sc.nextInt();
        System.out.print("Input the rate of interest: ");
        int b = sc.nextInt();
        System.out.print("Input number of years: ");
        int c = sc.nextInt();
        System.out.println("Years    FutureValue");
        for(int i = 0, j=c ; i<c && j>0 ; i++, j--){
            System.out.print((i+1)+"    ");
            futInvVal(a, b, i+1);
        }
    }
}