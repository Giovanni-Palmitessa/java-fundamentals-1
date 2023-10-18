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
    }
}
