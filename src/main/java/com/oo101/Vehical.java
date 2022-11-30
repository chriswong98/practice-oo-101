package com.oo101;

public class Vehical {

    private String name;
    private int speed;

    public Vehical(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String speedUp(){
        return name + ": speed up "+ speed + " km/h";
    }


}
