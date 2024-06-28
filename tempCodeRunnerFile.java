import java.util.Scanner;

public class ass1_prob43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] sourceArray = new int[n];
        System.out.println("Enter the elements of the source array:");
        for (int i = 0; i < n; i++) {
            sourceArray[i] = sc.nextInt();
        }
        int[] destinationArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            destinationArray[i] = sourceArray[i];
        }
        System.out.println("Elements of the destination array:");
        for (int i = 0; i < n; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}
