import java.util.Scanner;
public class ass1_prob42 {
    static void minToYnD(long a){
        if(a<1440) System.out.println("0 day(s) & 0 years(s)");
        if(a>=1440){
            if(a>=525600){
                long yr = a/525600;
                long dy = a%525600;
                if(dy>=1440){
                    System.out.println(yr+" year(s) "+dy/1440+"day(s)");
                }
                else System.out.println(yr+" year(s)");
            }
            else System.out.println(a/1440+" day(s)");
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        long n = sc.nextInt();
        minToYnD(n);

    }
}
