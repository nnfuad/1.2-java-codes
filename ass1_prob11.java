import java.util.*;
public class ass1_prob11 {
    static void Area(double a, double b, double c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triange is: "+area);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Input Side-1: ");
        a = sc.nextDouble();
        System.out.print("Input Side-2: ");
        b = sc.nextDouble();
        System.out.print("Input Side-3: ");
        c = sc.nextDouble();
        Area(a,b,c);
    }
}
