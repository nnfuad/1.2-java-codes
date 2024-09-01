import java.util.*;
public class lab4_prob1 {
       static class ImgNum{
        private double real,img;

        public ImgNum(double real , double img){
            this.real = real;
            this.img = img;
        }
        void setReal(double real){
            this.real = real;
        }
        void setImg(double img){
            this.img = img;
        }

        double getReal(){
            return real;
        }
        double getImg(){
            return img;
        }
        ImgNum add(ImgNum other) {
            double newReal = this.real + other.real;
            double newImg = this.img + other.img;
            return new ImgNum(newReal, newImg);
        }
        
    }
    
    public static void main(String[] args) {
        double a1,a2,b1,b2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First complex number's real part: ");
        a1 = sc.nextDouble();
        System.out.println("Enter the First complex number's imaginary part: ");
        b1 = sc.nextDouble();
        ImgNum z1 = new ImgNum(a1, b1);
        System.out.println("Enter the Second complex number's real part: ");
        a2 = sc.nextDouble();
        System.out.println("Enter the Second complex number's real part: ");
        b2 = sc.nextDouble();
        ImgNum z2  = new ImgNum(a2, b2);
        System.out.print("Complex Numbers added:\n1st Number:"+z1.getReal());
        System.out.println("+("+z1.getImg()+")i");
        System.out.print("2nd Number:"+z2.getReal());
        System.out.println("+("+z2.getImg()+")i");
        ImgNum z3 = z1.add(z2);
        System.out.println("Addition result: "+(z3.getReal())+" + ("+z3.getImg()+")i");
    }
}
