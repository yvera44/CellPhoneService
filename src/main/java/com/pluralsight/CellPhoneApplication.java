package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        phone1.setSerialNumber(1234567_1234567L);
        phone1.setCarrier("T-Mobil");
        phone1.setModel("iPhone 14 Pro");
        phone1.setPhoneNumber("773 323-2323");
        phone1.setOwner("John Cena");
        phone1.display();
    }

}
