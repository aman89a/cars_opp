package com.company;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck is initialized");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load(){
        System.out.println("Cargo load");
    }

    public void upload(){
        System.out.println("Cargo upload");
    }
}
