package Basics;

public class ResultingDatatype {
    public static void main(String[] args) {
        // the resulting data type is based on 
        // --> Type Promotion Hierarchy
        // byte --> short --> char --> int --> long --> float --> double

        // Increament and Decreament operators
        int i = 56;
        // int b = i++; first b is assigned to i and then i is increamented

        // first printing and then increamenting
        System.out.println(i++); 

        // first increamenting and then printing
        System.out.println(++i);

        // same goes for decreament operator...

        char ch = 'C';
        ch++;
        System.out.println(ch);
        // Java uses UniCode

    }
}
