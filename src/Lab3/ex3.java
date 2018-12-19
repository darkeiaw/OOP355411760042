package Lab3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        //display menus
        System.out.println("What is your favorite drink?");
        System.out.println("1. coffee.");
        System.out.println("2. Whisky.");
        System.out.println("3. Juices.");
        System.out.println("Select (1-3)? : ");
        //using Scanner
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        //switch-case
        switch (select) {
            case 1: System.out.println("You like Coffee.");
            break;
            case 2: System.out.println("You like Whisky.");
            break;
            case 3: System.out.println("You like Juices.");
            break;
            default:System.out.println("You might like other drink.");
        }
    }//main
}//class
