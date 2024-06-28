import java.util.*;
public class ass1_prob17 {
    
    static void isPos(int a ){
        if(a<0){
            System.out.println("Number is negative");
        }
        else System.out.println("Number is positive");;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a = sc.nextInt();
        isPos(a);
        
    }
}
