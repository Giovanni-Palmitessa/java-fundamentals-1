package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        //inizializzare lo scan
        Scanner scan = new Scanner(System.in);

        //Chiedere quanti chilometri si vogliono percorrere
        System.out.println("Quanti km vuoi percorrere?");
        int kmToTravel = scan.nextInt();

        //Chiedere età passeggero
        System.out.println("Quanti anni hai?");
        int age = scan.nextInt();
    }
}
