package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();
        System.out.print("Serial number: ");

        phone1.setSerialNumber(12345677654321L);
        phone1.setCarrier("Carrier: T-Mobile");
        phone1.setModel("Model: iPhone 14 Pro");
        phone1.setPhoneNumber("Phone number: (800)588-2300");
        phone1.setOwner("Owner: John Cena");
        phone1.display();

        System.out.println("========== User Input ==========");

        CellPhone phone2 = new CellPhone();
        System.out.print("What is the serial number? ");
        phone2.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.print("Who is your carrier? ");
        phone2.setCarrier(scanner.nextLine());
        System.out.print("What model is your phone? ");
        phone2.setModel(scanner.nextLine());
        System.out.print("What is the phone number? ");
        phone2.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner? ");
        phone2.setOwner(scanner.nextLine());


    }

}
