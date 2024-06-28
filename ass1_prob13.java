import java.util.*;
public class ass1_prob13 {
    static void countTwo( int a ){
        a=makePos(a);
        int count2 = 0;
        while(a!=0){
            if(a%10 == 2){
                count2++;
            }
            a=a/10;

        }
        System.out.println(count2);
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
        countTwo(a);
        
    }
}
