package com.example.phonaapp;

public class Contact {
    private String name;
    private int photo;
    private String number;

    public Contact() {
    }

    public Contact(String name, int photo, String number) {
        this.name = name;
        this.photo = photo;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
