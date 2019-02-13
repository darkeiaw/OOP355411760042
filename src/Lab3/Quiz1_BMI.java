<<<<<<< HEAD
package Lab3;
=======
package lab3;
>>>>>>> origin/master

import java.util.Scanner;

public class Quiz1_BMI {
<<<<<<< HEAD
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
=======

    public static void main(String[] args) {
        double w,h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        w = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        h = sc.nextDouble();

        //calculate BMI
        double bmi = w / (h * h);
        System.out.println("BMI = "+bmi);
        //Test condition
        if (bmi <18.50)
            System.out.println("น้ำหนักน้อย/ผอม");
        else if ((bmi >=18.50) && (bmi <=22.90))
            System.out.println("ปกติ/สุขภาพดี");
        else if (bmi >= 23 && bmi <= 24.90)
            System.out.println("ท้วม/โรคอ้วนระดับที่ 1");
        else if (bmi >= 25 && bmi <= 29.90)
            System.out.println("อ้วน/โรคอ้วนระดับที่ 2");
        else
            System.out.println("อ้วนมาก/โรคอ้วนระดับที่ 3");



    }//main

>>>>>>> origin/master
}//class