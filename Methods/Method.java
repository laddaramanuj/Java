package Methods;

public class Method {
    // a method is a fucntion written inside the class
    static int logic(int x, int y){
        return x+y;
    }

    int logic1(int x, int y){
        return x+y;
    }

    static void joke(){
        System.out.println("I invented a new joke");
    }

    static void change(int a[]){
        a[0] = 98;
    }
    public static void main(String[] args) {
        // static method can be accessed without the object creation
        System.out.println(logic(2, 3));

        // method invocation using Object Creation where static is not needed
        Method obj = new Method();
        System.out.println(obj.logic1(2, 3));

        joke();

        // the array is always passed by referance to the methods
        // the value of array element is changed in the method
        int a [] = {1,2,3,4,5};
        change(a);
        System.out.println(a[0]);
    }
}
