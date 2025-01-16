package Loops;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i = 5; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 10; i>=1; i--){
            System.out.println(10*i);
        }

        long fact = 1;
        for(int i = 20; i>=1; i--){
            fact *=i;
        }
        System.out.println(fact);
    }
}
