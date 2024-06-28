import java.util.Scanner;

public class Student {
    String varsity;
    String Dept;
    String Roll;
    String name;
    String Dob_day;
    String Dob_month;
    int Dob_year;
    int sems;
   int  CURRENT_YEAR=2024;
    
    void Display(){
        System.out.println("Varsity: "+varsity+
                "\nDeartment: "+Dept+
                "\nRoll: "+Roll+
                "\nName: "+name+
                "\nDate of birth: "+
                Dob_day+" "+Dob_month+", "+Dob_year+
                "\nSemester: "+sems+
                "\nAge:"+(CURRENT_YEAR-Dob_year));
                
                
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud =new Student[10];
        for(int i = 0 ;i<10 ;i++)
        {
            stud[i]=new Student();
            System.out.println("Enter University Name: ");
            stud[i].varsity = sc.nextLine();
            
            System.out.println("Enter Department Name: ");
            stud[i].Dept = sc.nextLine();
            
            System.out.println("Enter Roll Number: ");    
            stud[i].Roll = sc.nextLine();
            
            System.out.println("Enter Student Name: ");     
            stud[i].name = sc.nextLine();
            
            System.out.println("Enter Birth Date:\nYear:");     
            stud[i].Dob_year = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Month:");     
            stud[i].Dob_month = sc.nextLine();
            
            System.out.println("Day:");     
            stud[i].Dob_day = sc.nextLine();
            
            
            
            System.out.println("Current Semester: ");
            stud[i].sems = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0 ; i<10 ; i++){
            System.out.println("Info for student "+(i+1));
            stud[i].Display();
        }
    }
    
}
