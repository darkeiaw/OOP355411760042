package Lab3;

import java.util.Scanner;

public class Quiz1_BMI {
    public static void main(String[] args) {
        //display manus
        System.out.println("");
        //using Scaner
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("น้ำหนัก : ");
        x = scanner.nextInt();
        System.out.println("ความสูง: ");
        y = scanner.nextInt();
        System.out.println("Sum of x and y = " + (x % (y*y)));
        //<18.50
        //18.50-22.90
        //23-24.90
        //25-29.90
        //>30
        int score =0;
        if (score>=0 && score <=18.50)
            System.out.println("น้ำหนักน้อย/ผอม.");
        else if (score>=18.50 && score <=22.90)
            System.out.println("ปกติ (สุขภาพดี).");
        else if (score>=23 && score <=24.90)
            System.out.println("ท้วม/โรคอ้วนระดับ1.");
        else if (score>=25 && score <=29.90)
            System.out.println("อ้วน/โรคอ้วนระดับ2.");
        else if (score>=30)
            System.out.println("อ้วนมาก/โรคอ้วนระดับ3.");
        else
            System.out.println("Invalid Score.");

    }//main
}//class