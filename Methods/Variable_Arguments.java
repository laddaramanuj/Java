package Methods;

public class Variable_Arguments {
    // the concept of variable arguments
    // here x is compulsory argument and the array is temproray
    // here sum can be called with zero arguments
    static void sum(int x, int ...arr){
        // available as int arr
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        sum(2,3,4,5,6);
    }
}
