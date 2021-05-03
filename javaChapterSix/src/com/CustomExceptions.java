package com;

// Extend the exception class since you will need to inherit certain methods from it
public class CustomExceptions extends RuntimeException{

//    Create a constructor that takes an error message as a string
    public CustomExceptions(String errorType){
        super(errorType);
    }
}
