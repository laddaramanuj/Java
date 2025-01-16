package Methods;

public class Method_Overloading {
    // this concept is called method overloading here
    static void foo(){
        System.out.println("good morning!");
    }

    static void foo(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {

        // method overloading
        foo(); // Corrected method call
        foo(10); // Added example call to foo(int a)

        // method overloading cannot be done by changing the return type it can be only done by changing the parameters
        // method overloading only works with changing the parameters
    }
}
