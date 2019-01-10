package Lab5;

public class ex1 {
    public static void main (String[] args) {

        //array

        int num [];
        num = new int[15];
        num [0] =1;
        num [1] =2;
        num [2] =3;
        num [3] =4;
        num [4] =5;

        //Display values in array
        showArray(num);
        showArray2(num);



        }//main

    private static void showArray2(int[] num) {
        System.out.println("Data in array: ");
        for (int val:num){
            System.out.print(val+"\t");
        }
        System.out.println();

    }

    private static void showArray(int[] num) {

        System.out.println("Data in array: ");
        for (int i = 0; i <num.length ; i++) {
            System.out.print(num[i]+"\t");
        }
            System.out.println();
    }
}//calss
