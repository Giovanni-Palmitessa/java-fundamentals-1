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
        String nameToFind = scan.nextLine();

        //verifico se quel nome è presente nell'insieme
        //inizializzo una variabile booleana che tiene traccia se ho trovato il numero
        boolean found = false;

        //itero sull'array fino a che non trovo il nome
        for (int i = 0; i < guests.length; i++) {
            if (nameToFind.equals(guests[i])) {
                found = true;
                break;
            }
        }

        //PROVA CON CILO WHILE
        /*
        int i = 0;
        // Utilizzo un ciclo while per cercare il nome nell'array
        while (!found) {
            if (nameToFind.equals(guests[i])) {
                found = true;
                break;
            }

            // Incrementiamo l'indice
            i++;
        }
        */

        //se found = true ho trovato il numero
        if (found) {
            System.out.println("Nome presente nella lista degli invitati! Puoi entrare :D ");
        } else {
            //se found = false non l'ho trovato
            System.out.println("Nome non presente nella lista degli invitati! Non puoi entrare!");
        }

        //chiudere lo scan
        scan.close();
    }
}
