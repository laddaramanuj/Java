package Loops;
import java.util.Scanner;

public class Printing_Methods {
    public static void main(String[] args) {
        // String s1 = "harry";
        String s2 = new String("harry");
        System.out.println("the name is: ");
        System.out.println(s2);

        int a = 6;
        float b = 5.6454f;
        // two ways to print in the java having C language roots
        System.out.printf("the value of a anf b are %d, %8.2f", a, b);
        System.out.println();
        System.out.format("the value of a and b are %d, %f", a, b);

        System.out.println();
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        sc.close();

    }
    
}
