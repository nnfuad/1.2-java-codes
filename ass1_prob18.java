import java.util.*;
public class ass1_prob18 {
    static void root(double a , double b , double c){
        double det = Math.pow(b, 2) - (4*a*c);
        if(det > 0){
            double root1 = (-b + Math.sqrt(det)) / (2 * a);
            double root2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.println("The roots are "+root1+" and "+root2);
        }
        else if(det == 0){
            double root = -b / (2 * a);
            System.out.println("The roots are "+root+" and "+root);
        }
        else if(det < 0){
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-det) / (2 * a);
            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and"+realPart + " - " + imaginaryPart + "i");

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();
        root(a, b, c);
    }
}
