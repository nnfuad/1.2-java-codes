import java.util.Scanner;
public class ass1_prob40 {
    static int sumArr(int arr[], int index){
        if(index == arr.length-1) return 0;
        return arr[index] + sumArr(arr, index + 1);
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
        System.out.println("Sum of array elements is: "+sumArr(arr, 0));
    }
}
