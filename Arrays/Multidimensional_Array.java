package Arrays;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int [] [] flats = new int [2][3];
        System.out.println(flats[1][2]);
        System.out.println();
        
        // displaying a 2d array
        for(int i = 0; i<flats.length; i++){
            for(int j = 0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
            System.out.println();
        }

        
    }
}
