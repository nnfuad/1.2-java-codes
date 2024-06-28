import java.util.Scanner;

public class ass1_prob39 {

    
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxInRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxInRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxElement = findMax(arr, 0);
        System.out.println("The maximum element in the array is: " + maxElement);

        sc.close();
    }
}
