package com.oo101;

public class Car extends Vehical {

    private String name;
    private int speed;

    public Car(String name, Engine engine){
        super(name, engine.getSpeed());
        this.name = name;
        this.speed = speed;
    }


}
