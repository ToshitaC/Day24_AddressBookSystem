package com.blz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Welcome to Day24 programs");
        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.operationDirectory();
    }
}