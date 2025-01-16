package Arrays;

public class Array{
    public static void main(String[] args) {
        // arrays declaration, memory allocation
        // way 1
        int[] marks = new int [5];

        // way 2
        int[] marks1;
        marks1 = new int[5];

        // way 3
        int[] marks2 = {1,2,3,4,5};


        System.out.println(marks[2]);
        System.out.println(marks1[0]);
        System.out.println(marks2[3]);

        // length of array
        System.out.println(marks.length);

        // types of arrays
        String[] students = {"Harry", "Ramanuj", "Ronaldo", "Mbappe"};
        float[] points = {1, 2.3f, 3.4f};

        // displaying an array
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // for-each loop in java
        for(String element: students){
            System.out.println(element);
        }

        

    }
}