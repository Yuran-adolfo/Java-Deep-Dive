package Generics;

public class Printer <T>{ //Generic class
    //As you can  see , this is a Generic class. How do we know that this is a generic class?
    /* well, after the nome of the class you're going to see this <T>. And this is the thing
    * that tell us that this is a generic class, but it can be whatever you want.*/

    T thingtoprint; //This variable can hold any type of value like (Integer, Strings, Double etc...)

    Printer(T thingtoprint){ //Constructor
        this.thingtoprint=thingtoprint;
    }
    public  void print(){
        System.out.println(thingtoprint);
    }
}
