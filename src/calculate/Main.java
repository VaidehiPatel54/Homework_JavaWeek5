package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {        //Main method

        Calculator calculator = new Calculator();       //Create object of Parent class
        Scanner sc = new Scanner(System.in);            //Import scanner and create an object of scanner class
        String userInput = null;
        calculator.calculateResult(10,20,'*');      //call method via object name
        calculator.calculateResult(25,5,'/');       //call method via object name

        while (true) {
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            userInput = sc.next();
            if (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("Y"))) {
                System.out.println("Enter first Number :  ");
                int a = sc.nextInt();
                System.out.println("Enter second Number:  ");
                int b = sc.nextInt();
                System.out.println("Please enter one of symbol +,-,*, / :  ");
                char symbol = sc.next().charAt(0);
                calculator.calculateResult(a, b, symbol);
            }else if (userInput.equalsIgnoreCase("n") || (userInput.equalsIgnoreCase("N"))) {
                break;
            } else {
                System.out.println("Try Again With (Y/N) only ....");
            }
        }
    }
}