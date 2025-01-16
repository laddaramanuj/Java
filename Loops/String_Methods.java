package Loops;

public class String_Methods {
    public static void main(String[] args) {
        // some of commonly used string methods are
        // printing length of string
        String name = " Ramanuj Ladda";
        int value = name.length();
        System.out.println(value);

        // to lowercase
        System.out.println(name.toLowerCase());

        // to uppercase
        System.out.println(name.toUpperCase());

        // trimming the string
        System.out.println(name.trim());

        // starts the string printing from that index
        System.out.println(name.substring(3));

        // starts the string from start index to end index
        System.out.println(name.substring(3, 5));

        // replacing characters
        System.out.println(name.replace('a', 'p'));
        System.out.println(name.replace("Ra", "Me"));

        System.out.println(name.startsWith(" "));
        System.out.println(name.startsWith(" R"));
        System.out.println(name.endsWith("adda"));
        System.out.println(name.endsWith("dd"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("Ram"));
        System.out.println(name.indexOf("Ram", 0));
        System.out.println(name.lastIndexOf("Ra"));
        System.out.println(name.lastIndexOf("ama", 1));

        // if the string is equal to given string
        System.out.println(name.equals(" Ramanuj Ladda"));
        // the case of characters is ignored here
        System.out.println(name.equalsIgnoreCase(" Ramanuj laDDA"));

        // escape sequence characters
        System.out.println("I am ramanuj \\ ladda");
        System.out.println("I am ramanuj \n ladda");
        System.out.println("I am ramanuj \" ladda");
        System.out.println("I am ramanuj \t ladda");


        // formatting a letter with escape sequence characters
        String n5 = "Dear Ramanuj,\n\tThis is Java Course.\nThanks!";
        System.out.println(n5);



    }
}
