import java.util.*;
public class ass1_prob8 {
    static void charPrint(char a , char b){
        for(char i = a ; i<=b ; i++ ){
            System.out.print(i+" ");
        }
    }
    public static char nextChar(Scanner scanner) {
        return scanner.next().charAt(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a,b;
        System.out.println("Enter the starting character: ");
        a = nextChar(sc);
        System.out.println("Enter the starting character: ");
        b = nextChar(sc);
        charPrint(a, b);
        System.out.println();

    }
}
