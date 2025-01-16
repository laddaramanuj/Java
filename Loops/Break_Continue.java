package Loops;

public class Break_Continue{
    public static void main(String[] args) {
        // break statement
        for(int i = 0; i<50; i++){
            System.out.println(i);
            if(i == 2){
                System.out.println("its number 2");
                break;
            }
        }

        
        // continue statement skips the iteration, here it skips the number 2
        for(int i = 0; i<10; i++){
            if(i==2){
                continue;
            }
            System.out.println(i);

        }
    }
    
}