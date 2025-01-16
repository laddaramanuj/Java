package Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // average in java
        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        float res = 0;
        for(int element:marks){
            res+=element;
        }
        System.out.println((res/marks.length));

        // add two matrices
        Random r = new Random();
        int [] [] mat1 = new int [2][3];
        int [] [] mat2 = new int [2][3];
        int [] [] mat3 = new int [2][3];
        for(int i = 0; i<mat1.length; i++){
            for(int j = 0; j<mat1[i].length; j++){
                mat1[i][j] = r.nextInt(100);
                mat2[i][j] = r.nextInt(100);
            }
        }
        for(int i =0; i<mat1.length; i++){
            for(int j = 0; j<mat1[i].length; j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0; i<mat3.length; i++){
            for(int j = 0; j<mat3[i].length; j++){
                System.out.println(mat3[i][j]);
            }
            System.out.println();
        }

        // reverse an array
        int [] arr = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        



    }
}
