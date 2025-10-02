package com.pluralsight;

public class CellPhone {

        private Long serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;


    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void display(){
        System.out.println(
                this.getSerialNumber() + "\n" +
                this.getModel() + "\n" +
                this.getCarrier() + "\n" +
                this.getPhoneNumber() + "\n" +
                this.getOwner() + "\n");
    }
    public void dial(String phoneNumber) {
        System.out.println(this.getOwner() + "'s phone is calling " + phoneNumber);
    }

}
