package Exceptionss;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try { //This is the try block, It is going to execute the program and if anything goes wrong the catch block will handle it.
            System.out.println("Enter a number to be divided");
            int number1=scanner.nextInt();
            System.out.println("Enter a number to divide by");
            int number2=scanner.nextInt();
            int ans= number1/number2;
            System.out.println("Answer: "+ans);

        }
        catch (Exception e){ //This is the catch block, is will handle any errors that occurs inside the try block
            System.out.println("Error: "+e.getMessage());
        }

    }
}
