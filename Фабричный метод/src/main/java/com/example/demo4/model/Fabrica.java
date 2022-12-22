package com.example.demo4.model;

public class Fabrica {
    public static Shapep getShape(int i){
        if (i == 1){
            return new OvalMinus(100.0, 50.0);
        }else if (i == 2){
            return new Oval(50.0,50.0);
        }
        return new Rectengular(100.0, 0.0);
    }
}
