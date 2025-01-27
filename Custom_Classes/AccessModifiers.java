package Custom_Classes;

class My{
    // private access modifiers
    private int id;
    private String name;

    // creating getters and setters
    // getters -> returns the value -> accessors -> retireve value of private variable
    // setters -> sets/updates the value -> mutators -> modify value of private variable
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setName(int i){
        id = i;
    }


}

public class AccessModifiers {
    public static void main(String[] args) {
        
    }
    
}
