package com.grf.animal;

public class Ship implements IDelivery{
    @Override
    public void sending() {
        System.out.println("sending by ship");
    }
}
