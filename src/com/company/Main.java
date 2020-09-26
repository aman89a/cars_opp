package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Truck truck = new Truck("Volvo", "A312", EngineType.DIESEL, 12, 45, 100);
        truck.load();
        truck.upload();



        Bus bus = new Bus("Bwm", "X5", EngineType.GAS, 100, 300, 10);
        System.out.println(bus.getProducer());
        System.out.println(bus.getModel());
    }
}
