package com.grf.animal;

public class Box implements ISendable {
    private String city;
    private String Content;

    @Override
    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
