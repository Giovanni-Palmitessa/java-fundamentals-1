package org.lessons.java;

import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        //inizializzare lo scan
        Scanner scan = new Scanner(System.in);

        //Inizializzare l'Array
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //chiedo all'utente un nome
        System.out.print("Dimmi il tuo Nome: ");
        int nameToFind = scan.nextInt();

        //verifico se quel nome è presente nell'insieme
        //inizializzo una variabile booleana che tiene traccia se ho trovato il numero
        boolean found = false;

        for (int i = 0; i < guests.length; i++) {

        }

        //chiudere lo scan
        scan.close();
    }
}
