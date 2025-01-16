package Loops;

public class While_Loop_For_Loop {
    public static void main(String[] args) {
        // while loop
        // int i = 1;
        // while(true){
        //     System.out.print(i);
        // }

        // infinite loop
        // int j = 100;
        // while(j<=2356466){
        //     System.out.println(j);
        //     j++;
        // }

        // do-while loop guaranteed to execute at least once
        int b = 10;
        do{
            System.out.println("do while loop");

        }while(b<5);

        // for loop
        for(int i = 0; i<10; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
 
    
}
