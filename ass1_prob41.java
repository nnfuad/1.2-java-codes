import java.util.*;
public class ass1_prob41 {
    static double FtoC(double a ){
        double x = 5*((a-32)/9);
        return x;
    }
    public static void main(String[] args) {
        System.out.print("Input a degree in Farenheit: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("%.1f degree Farenheit is equal to %.1f degree in Celsius\n",x,FtoC(x));

    }
}
