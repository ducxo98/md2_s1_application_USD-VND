package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double usd ;
        double VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap usd:");
        usd = scanner.nextDouble();
        double doiusd= usd* VND;
        System.out.println("VND:" + doiusd);
    }
}
