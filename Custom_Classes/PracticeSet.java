package Custom_Classes;

class Employee{
    int salary;
    public int getSalary(){
        return salary;
    }
    String name;
    public String getName(){
        return name;
    }
    public void SetName(String newName){
        name = newName;
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}

public class PracticeSet {
    public static void main(String[] args) {
        Employee ram = new Employee();
        ram.salary = 100;
        System.out.println(ram.getSalary());

        ram.name = "Ramanuj";
        System.out.println(ram.getName());

        ram.SetName("anuj");
        System.out.println(ram.getName());

        Square s1 = new Square();
        s1.side = 4;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}