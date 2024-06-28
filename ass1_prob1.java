import java.util.Scanner;

public class ass1_prob1 {
    static void smallNum(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest number");
        } else if (c < a && c < b) {
            System.out.println(c + " is the smallest number");
        } else if (a == b && a < c) {
            System.out.println(a + " & " + b + " are equal and the smallest");
        } else if (a == c && a < b) {
            System.out.println(a + " & " + c + " are equal and the smallest");
        } else if (b == c && b < a) {
            System.out.println(b + " & " + c + " are equal and the smallest");
        } else {
            System.out.println("All three numbers are equal");
        }
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x= sc.nextInt();
        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();
        System.out.println("Enter third number:");
        int z = sc.nextInt();
        smallNum(x,y,z);
        }
        
    }
    

