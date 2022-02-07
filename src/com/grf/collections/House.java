package com.grf.collections;

public class House {

    public House() {

    }

    public House(String address) {
        setAddress(address);
    }

    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "Address='" + Address + '\'' +
                '}';
    }
}
