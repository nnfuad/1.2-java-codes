import java.util.Scanner;

public class ass1_prob46{
    static void revdisp(int a[])
    {
        System.out.println("Array elements in reverse order is:");
        for (int i= a.length -1 ; i>=0 ;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("How many elements do you want to store? ");
        int x = sc.nextInt();
        int[] a= new int[x];
        System.out.print("Enter the elements: ");
        for(int i = 0 ; i<x ;i++){
            a[i] = sc.nextInt();
        }
        revdisp(a);
    }

}