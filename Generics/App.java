package Generics;

public class App {

    public static void main(String[] args) {

        Printer<Integer> printer=new Printer<>(45); //Specifying the data type that it must hold

        /*If you read the readme you know that a generic class can capture any type of value and this is the idea of
        * generics,you only have to specify the type data type where you want yuo use it. In this case we want to
        * print an Integer so we specified the type of value that the object must hold. */

        printer.print();// calling the method print


    }
}
