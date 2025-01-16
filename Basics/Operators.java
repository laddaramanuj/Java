package Basics;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // operators in Java
        int a = 5;
        System.out.println(a);
        System.out.println(64>6);
        System.out.println(64>6 && 64< 6);
        int b = 9;
        b *= 9;
        System.out.println(b);
        System.out.println(b%9);
        System.out.println(2&3);
        System.out.println(2|3);

        // 4.8 % 1.1 returns decimal reminder
        System.out.println(4.8%1.1);

        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.println("the given number is greater than 10->>" + (z > 10));
        sc.close();



    }
}