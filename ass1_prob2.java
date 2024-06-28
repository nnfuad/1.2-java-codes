import java.util.Scanner;

public class ass1_prob2 {
    static void avgNum(int a, int b, int c) {
        System.out.println("Average of the given three number is: "+(double)(a+b+c)/3);
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x= sc.nextInt();
        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();
        System.out.println("Enter third number:");
        int z = sc.nextInt();
        avgNum(x,y,z);
        }
        
    }
    

