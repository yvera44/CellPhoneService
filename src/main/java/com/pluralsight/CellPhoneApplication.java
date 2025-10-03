package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();

        phone1.setSerialNumber("Serial number: Y2J67XFF4RM9");
        phone1.setCarrier("Carrier: T-Mobile");
        phone1.setModel("Model: iPhone 14 Pro");
        phone1.setPhoneNumber("Phone number: (312)588-2300");
        phone1.setOwner("John Cena");


        phone1.display();
        phone1.dial("(773)123-1222\n");

        System.out.println("======= With Constructor =======");

        CellPhone phone2 = new CellPhone("X2J67XGG4RM9", "iPhone 15", "Verizon", "(312)444-5577", "Smitty Werbenjagermanjensen");
        phone2.display();

        System.out.println("========== User Input ==========");

        CellPhone phone3 = new CellPhone();

        System.out.print("What is the serial number? ");
        phone3.setSerialNumber(scanner.nextLine());
        System.out.print("Who is your carrier? ");
        phone3.setCarrier(scanner.nextLine());
        System.out.print("What model is your phone? ");
        phone3.setModel(scanner.nextLine());
        System.out.print("What is the phone number? ");
        phone3.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner? ");
        phone3.setOwner(scanner.nextLine());


    }

}
