package com.enumCodes;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object(new) of Operation

    Operation() {
        System.out.println("Constructor");

    }
}
