package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //inizializzare lo scan
        Scanner scan = new Scanner(System.in);

        //Chiedere il nome
        System.out.println("Qual'è il tuo nome?");
        String name = scan.nextLine();

        //Chiedere il cognome
        System.out.println("Qual'è il tuo cognome?");
        String surname = scan.nextLine();

        //Chiedere il colore preferito
        System.out.println("Qual'è il tuo colore preferito?");
        String color = scan.nextLine();

        //Chiedere data di nascita
        System.out.println("Qual'è la tua data di nascita (Formato DD-MM-AAAA)?");
        String birthday = scan.nextLine();

        // Analizza la data di nascita per estrarre giorno, mese e anno
        String[] parts = birthday.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Calcola la somma del giorno, del mese e dell'anno di nascita
        int birthSum = day + month + year;

        // Concatenare tutte le informazioni per generare la password
        String password = name + "-" + surname + "-" + color + "-" + birthSum;

        // Stampare la password generata
        System.out.println("La tua password è: " + password);

        //chiudere lo scan
        scan.close();
    }
}
