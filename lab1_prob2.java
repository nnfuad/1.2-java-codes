import java.util.Scanner;
public class lab1_prob2 {
    static int fib(int a){
        if(a == 1) return 1 ;
        if(a==2) return 2;
    
        return fib(a-1) + fib(a-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.print(1+" ");
    for(int i =1 ; i<x ;i++){
    System.out.print(fib(i)+" ");

    }
    System.out.println();


    }
}
