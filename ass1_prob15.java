import java.util.*;
public class ass1_prob15 {
    static boolean evenIs( int a ){
        a=makePos(a);
        int flag = 1;
        while(a!=0){
            int n = a%10;
            if(n%2 != 0 ){
                flag = 0;
                break;
            }
            a=a/10;

        }
        if(flag ==1) return true;
        else return false;
        
    }
    static int makePos(int a ){
        if(a<0){
            return a*(-1);
        }
        else return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a = sc.nextInt();
        System.out.println(evenIs(a));
        
    }
}