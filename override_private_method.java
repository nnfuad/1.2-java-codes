/*
 * Comparison With C++ 
1) In Java, inner Class is allowed to access private data members of outer class. 
    This behavior is same as C++ (See this). 
2) In Java, methods declared as private can never be overridden, 
    they are in-fact bounded during compile time. 
    This behavior is different from C++. In C++, we can have virtual private methods (See this). 
 */

public class override_private_method {
    class Base {
        public void fun() {
           System.out.println("Base fun");     
        }
      }
        
      class Derived extends Base {
        public void fun() {  // overrides the Base's fun()
           System.out.println("Derived fun");     
        }
        public static void main(String[] args) {
            Base obj = new Derived();
            obj.fun();
        }  
      }
      
}
