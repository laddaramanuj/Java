package Loops;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int age = 18;
        if(age > 18){
            System.out.println("You can drive");
        }
        else if(age > 50){
            System.out.println("You are above 50");
        }
        else{
            System.out.println("You are noob");
        }

        Scanner sc = new Scanner(System.in);
        int agee = sc.nextInt();
        // here in switch case you can give integer, character, or string in java
        switch (agee) {
            case 18:
                System.out.println("You are an adult");
                break;
            case 21:
                System.out.println("You look for an job now");
                break;
            default:
                System.out.println("You are not born yet");
                break;
        }
        System.out.println("Thankks for using my java code");

        
    }
    
}
