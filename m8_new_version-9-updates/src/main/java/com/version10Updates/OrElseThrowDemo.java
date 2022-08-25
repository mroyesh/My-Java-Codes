package com.version10Updates;

import java.util.Optional;

public class OrElseThrowDemo {


    public static void main(String[] args) {
        Optional<String> str= Optional.empty();
        System.out.println(str);


        if(str.isPresent()){
            System.out.println(str.get());
            }else{

            //exception handling
        }
        System.out.println(str.isPresent());
        System.out.println(str.orElseThrow(()->new RuntimeException()));
    }
}
