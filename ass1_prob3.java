import java.util.Scanner;

public class ass1_prob3 {
    static void middleString(String a) {
        if(a== null){
            System.out.println("String is empty.");
            return;
        }
        else if(a.length()%2==0){
            System.out.println("String is even lengthed, middle characters are: "+a.charAt((a.length())/2-1)+a.charAt((a.length()/2)));
            return;
        }
        else if(a.length()%2!=0){
            System.out.println("Middle character is : "+a.charAt((a.length()/2)));
            return;
        }
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        middleString(a);
        }
        
    }
    

