import java.util.Scanner;

public class ass1_prob45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        boolean foundDuplicate = false;

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.println(array[i]);
                    foundDuplicate = true;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
