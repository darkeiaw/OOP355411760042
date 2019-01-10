package Lab4;

public class ex2 {
    public static void main (String[] args) {

        int x,y;
        x = 5;
        y = 10;
        double a,b;
        a = 5.5;
        b = 20.20;
        summation(x,y);
        //overloading methods
        summation(a,b);
    }//main

    private static void summation (int x, int y) {
        int sum =x+y;
        System.out.println("Summation of x and y = "+sum);
    }//summation
    private static void summation (double x, double y) {
        double sum = x + y;
        System.out.println("Summation of x and y = " + sum);
    }
}//class