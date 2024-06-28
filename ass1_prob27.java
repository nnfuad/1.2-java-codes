import java.util.*;
public class ass1_prob27 {
    static void floydTri(int a){
        int n = 1;
        for(int i = 1 ; i<=a ;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        floydTri(a);
    }
}
