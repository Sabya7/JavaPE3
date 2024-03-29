package com.stackroute.pe3;
/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.
* */
public class ExceptionExample{
    public static void main(String[] args) {
        try {
            System.out.println("Inside try Block");
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Inside catch block");
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
