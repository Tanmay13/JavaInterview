package com.FinalFinallyFinalized;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            // code which might raise exception
 
            int result = 19/0;
            System.out.println("Result of division : " + result);
        }
        catch(ArithmeticException aex) {
 
            // corresponding handling code, if any exception from try block
 
            System.out.println(aex.toString());
        }
        finally {
 
            // finally block always gets executed for code clean-up activities
 
            System.out.println("finally block always gets executed");
            // rest of the code clean-up
        }
    }
}