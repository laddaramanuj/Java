package Day1;

public class Precedance {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        // highest precedance goes to * and /, they are then evaluated on the basis of left to right associativity
        System.out.println(a);

        int b = 60/5-34*2;
        // it is evaluated on the basis of left to right associativity
        System.out.println(b);

        // the example of right to left associativity
        int d;
        int c = d = 5;
        System.out.println(d);
        System.out.println(c);

        // important concept
        float z = 7/4.0f*9/2.0f;
        System.out.println(z);

        // practice
        // float nw = ((v*v) -(u*u))/2*a*s;

    }
}
