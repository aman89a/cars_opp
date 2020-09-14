package com.company;

public class Truck extends Auto {

    private int cargoWeight;
    public Truck(String producer, String model, EngineType engineType){
        super(producer, model, engineType);
        System.out.println("Truck is initislized");
    }
}
