import java.util.*;
public class ass1_prob14 {
    static boolean consec(int a , int b , int c){
        if ((b== a+1) && (c==b+1)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.println(consec(a, b, c));
    }
}
