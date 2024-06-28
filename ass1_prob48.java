import java.util.Scanner;
public class ass1_prob48 {
    static void ascendArr(int a[]){
        for(int i = 0 ; i<a.length-1 ;i++){
            for(int j = 0 ;j<a.length-1-i ;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i = 0 ; i<a.length ;i++){
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
        ascendArr(a);
    }
}