package com.grf.animal;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setCity("tehran");
        IDelivery delivery1 = DeliveryFactory.getInstance(box1);
        delivery1.sending();

        Box box2 = new Box();
        box2.setCity("melborn");
        IDelivery delivery2 = DeliveryFactory.getInstance(box2);
        delivery2.sending();

    }
}
