package homework9;

import java.util.Scanner;
//3. Write a Java program to reverse an array of integer values.
public class Prg3_ReverseArray {

    public static void main(String[] args) {

        int n,i,j;
        Scanner s = new Scanner(System.in);                          //import Scanner class and create a scanner object
        System.out.print("Enter no. of elements you want in array:"); //print statement for input element
        n = s.nextInt();                                              // Read user input
        int[] num = new int[n];
        System.out.println("Enter all the elements:");
        for ( i = 0; i < num.length; i++) {                         //for loop
        num[i] = s.nextInt();}


        System.out.println("\n Array before reverse : ");
        for ( i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        for (i = 0, j = num.length - 1; i < j; i++, j--) {          //logic for reverse array
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        System.out.println("\n Array after reverse : ");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
