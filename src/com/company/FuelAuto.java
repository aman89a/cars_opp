package com.company;

public class FuelAuto extends Auto {
    private int availabiePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, EngineType engineType, int availabiePetrol, int tankVolume) {
        super(producer, model, engineType);
        this.availabiePetrol = availabiePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuleUp(int perolVolume) {
        availabiePetrol += perolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvailabiePetrol() {
        return availabiePetrol;
    }

    public void setAvailabiePetrol(int availabiePetrol) {
        this.availabiePetrol = availabiePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
