package Custom_Classes;

// a constructor in java is a special method used to initialize objects
// it is called automatically when object of a class is created
// they do nnot have a return type and has same name as the class name
// used to automatically initialize some values to its variables

class MainEmployee {
    private int id;
    private String name;

    // this is a constructor
    // we can have multiple constructors in a class
    // we can give arguments to the constructor too
    // we can overload the constructors too
    public MainEmployee(String my_name){
        id = 101;
        name = my_name;
    }

    // overloaded constructor
    public MainEmployee(){
        id = 102;
        name = "rama";
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        MainEmployee e1 = new MainEmployee("ramanuj");
        MainEmployee e2 = new MainEmployee();

        // printing object e1
        System.out.println(e1.getID());
        System.out.println(e1.getName());

        // printing object e2
        System.out.println(e2.getID());
        System.out.println(e2.getName());
    }
}