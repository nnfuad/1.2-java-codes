import java.util.Scanner;
class prob1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0 && a<40){
            System.out.println("Failed");

        }
        else if(a>=40 && a<45){
            System.out.println("D");
        }
        else if(a>=45 && a<50){
            System.out.println("C");
        }
        else if(a>=50 && a<55){
            System.out.println("C+");
        }
        else if(a>=55 && a<60){
            System.out.println("B-");
        }
        else if(a>=60 && a<65){
            System.out.println("B");
        }
        else if(a>=65 && a<70){
            System.out.println("B+");
        }
        else if(a>=70 && a<75){
            System.out.println("A-");
        }
        else if(a>=75 && a<80){
            System.out.println("A");
        }
        else if(a>=80 && a<100){
            System.out.println("A+");
        }
        else System.out.println("Invalid input...");
    }
}