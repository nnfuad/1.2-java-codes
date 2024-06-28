import java.util.Scanner;

public class ass1_prob10 {
    public static boolean isValidPassword(String password) {
        
        if (password.length() < 8) {
            return false;
        }
        
        
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        
        
        if (digitCount < 2) {
            return false;
        }
        
        else
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A password must have at least eight characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }
    }   
}
