package Custom_Classes;

class Employee{
    // settings the attributes
    int id;
    String name;

    // setting the method
    public void printDetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }
}

// every java file contains only one public class
public class Main {
    public static void main(String[] args) {
        System.out.println("this is our custom class");

        // instantiating a new employee object
        Employee harry = new Employee();
        Employee john = new Employee();

        // settings attributes for harry
        harry.id = 12;
        harry.name = "CodeWithHarry";

        // setting attributes for john
        john.id = 13;
        john.name = "CodewithJOHN";
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        // priniting details of harry class, obejct harry
        harry.printDetails();
        System.out.println();
        // printing details of john class, object john
        john.printDetails();
    }
}
