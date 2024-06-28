import java.util.*;
public class ass1_prob16 {
    static boolean isVowel (String a){
        int flag =1;
        for(int i = 0 ; i<a.length() ; i++){
            if(a.charAt(i) != 'a' || a.charAt(i) != 'e' || a.charAt(i) != 'i' || a.charAt(i) != 'o' ||a.charAt(i) != 'u'){
                flag =0;
                break;
            }
        }
        if(flag ==1) return true;
        else return false;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(isVowel(a));
    }
}
