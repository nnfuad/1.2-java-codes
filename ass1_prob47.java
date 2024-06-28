import java.util.Scanner;
public class ass1_prob47 {
    static void minArr(int a[]){
        int min=a[0];
        for(int i = 0 ; i<a.length ; i++){
            if(a[i]<=min){
                min = a[i];
            }
        }
        System.out.println("Smallest array element is: "+min);
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
        minArr(a);
    }
}

