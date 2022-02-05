package com.grf.animal;

public class DeliveryFactory {

    public static IDelivery getInstance(ISendable sendable) {
        if (sendable.getCity().equals("tehran")) {
            return new Snapp();
        } else if (sendable.getCity().equals("bandarAbbas")) {
            return new Airplain();
        } else if (sendable.getCity().equals("melborn")) {
            return new Ship();
        }
        return null;
    }

}
