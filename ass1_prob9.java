import java.util.*;
public class ass1_prob9 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int a  = sc.nextInt();
        if(isLeapYear(a)) System.out.println(a+" is a leap year.");
        else System.out.println(a+" is not a leap year.");
    }
}
