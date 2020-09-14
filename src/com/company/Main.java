package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bus bus = new Bus("Bwm", "X5", EngineType.DIESEL);
        System.out.println(bus.getProducer());
        System.out.println(bus.getModel());
    }
}
