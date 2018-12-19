package Lab2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("What is you name?: ");
        name = scanner.nextLine();
        System.out.println("How old are you?: \r");
        age = scanner.nextInt ();
        //Display
        System.out.println("Hi, "+name);
        System.out.println("You are "+age+" year old");


    }//main
}//class
