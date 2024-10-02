package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HonorSmartphone honorSmartphone = new HonorSmartphone("idkHonor");
        SamsungSmartphone samsungSmartphone = new SamsungSmartphone("idkSamsung");

        System.out.println(honorSmartphone.model.toString());
        System.out.println(samsungSmartphone.model.toString());
    }
}