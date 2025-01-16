package Methods;
import java.util.Scanner;
// practice set 
public class Practice {
    static int foo(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n+foo(n-1);
        }
    }

    static float foo(int ...arr){
        float sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(foo(n));
        sc.close();

        System.out.println(foo(1,2,3,4,5));

    }
}
