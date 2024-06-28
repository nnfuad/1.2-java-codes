import java.util.Scanner;

public class Car {
    String milage, model, brand, color;

    Car(String milage, String model, String brand, String color) {
        this.milage = milage;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    void display() {
        System.out.println("Brand Name: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Milage: " + milage);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car cars[] = new Car[10];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter information for car " + (i + 1) + ":");
            System.out.println("Brand Name:");
            String brand = sc.nextLine();
            System.out.println("Model Name:");
            String model = sc.nextLine();
            System.out.println("Milage:");
            String milage = sc.nextLine();
            System.out.println("Color:");
            String color = sc.nextLine();

            cars[i] = new Car(milage, model, brand, color);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Information for car " + (i + 1) + ":");
            cars[i].display();
        }
    }
}
