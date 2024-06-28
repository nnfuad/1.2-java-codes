import java.util.Scanner;

public class Coffee_Shop {
    int id,points=0,purchase;
    void bal_point(){
        System.out.println(points);
}
    void buy_points(int purchase){
       if(purchase>=5)
        points= purchase/5; 
    }
    void sub_points(int a){
        if(points>=10){
            System.out.println("10% Discount given");
            points-=10;
        else{
            System.out.println("");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer ID:");
        Coffee_Shop c1= new Coffee_Shop();
        c1.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the purshasing amount:");

        c1.purchase=sc.nextInt();
        sc.nextLine();
        System.out.println("Do you want to ");
        c1.buy_points(c1.purchase);
        c1.sub_points(c1.points);
        c1.bal_point();
        
        
    }
    
}
