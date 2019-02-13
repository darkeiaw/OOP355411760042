package Lab3;

import java.util.Scanner;

public class ex3 {
        public static void main(String[] args) {
            //display manus
            System.out.println("What your favorite drink? ");
            System.out.println("1. Coffee.");
            System.out.println("2. Whisky.");
            System.out.println("3. Juice.");
            System.out.println("Select (1-3)? : ");
            //using Scaner
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            //switch-case
            switch (select) {
                case 1:
                    System.out.println("You link Coffe.");
                    break;
                case 2:
                    System.out.println("You link Whisky.");
                    break;
                case 3:
                    System.out.println("You link Juice.");
                    break;
                default:System.out.println("You might like other drink.");


            }

        }//maim
    }//class
