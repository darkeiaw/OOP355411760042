package Lab5;

import java.util.Arrays;
import java.util.Scanner;

//1. create array 10 elements
//2. get data from  user
//3. show data in array
//4. find maximum data
//5. find minimum data
//6. find total data
//7. find average data
//8. Sorting Array
public class ex2 {

    public static void main(String[] args) {
        int num[] = new int[5];
        num = getData(num);
        showArray(num);
        findMinimum(num);
        findMaximum(num);
        findTotal(num);
        sortingArray(num);

    }//main

    private static void sortingArray(int[] num) {

        Arrays.sort(num);
        System.out.println("Sorting Data in array: ");
        showArray(num);
    }

    private static void findTotal(int[] num) {
        int total = 0;
        for (int val : num){
            total += val;
        }
        System.out.println("The Total value = "+total);
        findAverage(total,num.length);
    }

    private static void findAverage(int total, int length) {
        System.out.println("The average value ="+(total/length));
    }

    private static void findMinimum(int[] num) {
        int min = num[0];
        for (int val: num){
            if (min> val)
                min = val;
        }
        System.out.println("The minimum data = "+min);
    }
    private static void findMaximum(int[] num) {
        int max = num[0];
        for (int val: num){
            if (max< val)
                max = val;
        }
        System.out.println("The maximum data = "+max);
    }

    private static void showArray(int[] num) {
        System.out.println("Data in array: ");
        for (int val : num) {
            System.out.print(val + "\t");
        }
        System.out.println();

    }

    private static int[] getData(int[] num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array below: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter and integer: ");
            num[i] = sc.nextInt();
        }
        return num;
    }//getData
}//class
