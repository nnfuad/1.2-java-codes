import java.util.Scanner;

public class ass1_prob20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        do {
            System.out.print("Enter a number between 1 and 7: ");
            number = scanner.nextInt();
            
            if (number < 1 || number > 7) {
                System.out.println("Invalid input. Number must be between 1 and 7.");
            }
        } while (number < 1 || number > 7);
        

        String weekdayName = getWeekdayName(number);
        
        System.out.println("Weekday name for the number " + number + " is: " + weekdayName);
        
       
    }
    public static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid";
        }
    }
}
