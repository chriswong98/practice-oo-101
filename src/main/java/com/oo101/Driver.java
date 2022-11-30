package com.oo101;

public class Driver {

    private Vehical vehical;

    public Driver(Vehical vehical){
        this.vehical = vehical;
    }

    public String speedUp(){
        return vehical.speedUp();
    }


    public static void main(String[] args) {

         Driver driver = new Driver(new Car("Cool Car", new GasolineEngine()));
        System.out.println(         driver.speedUp() );



    }

}
