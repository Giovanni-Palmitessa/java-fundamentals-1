package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        //inizializzare lo scan
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#0");

        //Chiedere quanti chilometri si vogliono percorrere
        System.out.println("Quanti km vuoi percorrere?");
        int kmToTravel = scan.nextInt();

        //Chiedere età passeggero
        System.out.println("Quanti anni hai?");
        int age = scan.nextInt();

        //totale del viaggio
        double ticketPrice = 0.21;
        double total = kmToTravel * ticketPrice;
        System.out.println("Il totale del viaggio è: " + format.format(total));

        //definisco lo sconto
        double discountJunior = 0.2;
        double discountSenior = 0.4;
        double discount20 = total * discountJunior;
        double discount40 = total * discountSenior;

        //controllo età
        if (age < 18) {
            total = total - discount20;
        } else if (age > 65) {
            total = total - discount40;
        }

        System.out.println("Il costo del biglietto è di: " + format.format(total) + " €");
    }
}
