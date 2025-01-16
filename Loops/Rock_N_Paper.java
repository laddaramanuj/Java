    package Loops;
    import java.util.Random;
    import java.util.Scanner;

    public class Rock_N_Paper {
        public static void main(String[] args) {
            Random rand = new Random();
            int comp = rand.nextInt(3);

            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            sc.close();

            if((comp == 0 && user == 2) || (comp == 2 && user == 1) || (comp == 1 && user == 0)){
                System.out.println("Comp wins!");
                System.out.println(comp);
            }
            else if(user == comp){
                System.out.println("Play again");
            }
            else{
                System.out.println("User wins!");
                System.out.println(comp);
            }
            
        }
    }
