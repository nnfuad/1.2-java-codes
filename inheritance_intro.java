/*
 * Inheritance in Java is a mechanism in which one object acquires all
  the properties and behaviors of a parent object. 
  It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes
 that are built upon existing classes. When you inherit from an existing class, 
 you can reuse methods and fields of the parent class. Moreover, 
 you can add new methods and fields in your current class also.

 */
// Single Inheritance:
class animal {
    void eat() {
        System.out.println("All animal eats");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Dogs bark");
    }
}

// Multilevel inheritance:
class puppy extends dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

//Hierarchical Inheritance:
class cat extends animal {
    void meow() {
        System.out.println("I go meow");
    }
}
public class inheritance_intro {
    public static void main(String[] args) {
        animal a1 = new animal();
        animal a2 = new dog();
        animal a3 = new puppy();
        
        a1.eat(); // called with animal(a1) class, animal instance
        System.out.println("called with animal(a1) class, animal instance");
        
        a2.eat(); // called with animal(a2) class, dog instance
        System.out.println("called with animal(a2) class, dog instance");
        
        a3.eat(); // called with animal(a3) class, puppy instance
        System.out.println("called with animal(a3) class, puppy instance");
        
        // The following will cause a compile-time error:
        // a1.bark();
        // a1.weep();

        // Safe casting using instanceof
        if (a1 instanceof dog) {
            ((dog) a1).bark(); // This will cause ClassCastException since a1 is not a dog
        } else {
            System.out.println("a1 is not an instance of dog");
        }

        if (a2 instanceof dog) {
            ((dog) a2).bark(); // This will work
            System.out.println("Type casted a2 with dog");
        }

        if (a3 instanceof puppy) {
            ((puppy) a3).weep(); // This will work
            System.out.println("Type casted a3 with puppy");
        }

        dog d1 = new puppy(); // creates an instance of puppy but references it with dog
        d1.eat(); // called with dog(d1) class, puppy instance
        System.out.println("called with dog(d1) class, puppy instance");
        d1.bark(); // called with dog(d1) class, puppy instance
        System.out.println("called with dog(d1) class, puppy instance");

        dog d2 = new dog();
        d2.eat(); // called with dog(d2) class
        System.out.println("called with dog(d2) class");
        d2.bark(); // called with dog(d2) class
        System.out.println("called with dog(d2) class");

        // d1.weep();  // will give error because referenced with dog not puppy

        // puppy p1 = new dog(); // Child class cannot create an instance of parent class.
        puppy p1 = new puppy();
        p1.eat(); // called with puppy class
        System.out.println("called with puppy class");
        p1.bark(); // called with puppy class
        System.out.println("called with puppy class");
        p1.weep(); // called with puppy class
        System.out.println("called with puppy class");

        cat c1 = new cat();
        c1.eat(); // called with cat class
        System.out.println("called with cat class");
        c1.meow();
        System.out.println("called with cat class");



        // Checking types at runtime using instanceof
        System.out.println(a1 instanceof animal); // true
        System.out.println(a1 instanceof dog); // false
        System.out.println(a1 instanceof puppy); // false
        System.out.println(a2 instanceof animal); // true
        System.out.println(a2 instanceof dog); // true
        System.out.println(a2 instanceof puppy); // false
        System.out.println(a3 instanceof animal); // true
        System.out.println(a3 instanceof dog); // true
        System.out.println(a3 instanceof puppy); // true
    }
}
