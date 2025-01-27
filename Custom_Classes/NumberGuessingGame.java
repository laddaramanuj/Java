package Custom_Classes;

import java.util.*;

class Game{
    private int userInput;
    private int noOfGuesses;
    private int compInput;
    boolean isTrue = true;

    public Game(){
        Random r1 = new Random();
        compInput = r1.nextInt(100);
    }
    
    public void getUserInput(int input){
        userInput = input;
    }

    public void isCorrectNumber(){
        if(userInput == compInput){
            System.out.println("You win with number of guesses -> " + noOfGuesses);
            System.out.println("the computer guess was " + compInput);
            isTrue = false;
        }
        else if(userInput > compInput){
            noOfGuesses++;
            System.out.println("little smaller man");
        }
        else{
            noOfGuesses++;
            System.out.println("little bigger man");
        }
    }
}

public class NumberGuessingGame {
    public static void main(String[] args) {
        Game g1 = new Game();
        Scanner sc = new Scanner(System.in);
        while(g1.isTrue == true){
            int input = sc.nextInt();
            g1.getUserInput(input);
            g1.isCorrectNumber();
        }
        sc.close();
        System.out.println(Math.PI);
    }
}