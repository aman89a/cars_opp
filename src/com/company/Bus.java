package com.company;

public class Bus extends FuelAuto {

    private int passengersNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengersNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
        System.out.println("Bus is initialized");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuleUp(volume);

    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void pickupPassengers(int passengersNumber){
        this.passengersNumber += passengersNumber;
        System.out.println("Passenger number" + passengersNumber);
    }

    public void releasePassengers(){
        if(isRunning){
            stop();
        }
        passengersNumber = 0;
        System.out.println("Passengers is release");
    }
}
