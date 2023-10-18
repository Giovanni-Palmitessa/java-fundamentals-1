package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //inizializzare lo scan
        Scanner scan = new Scanner(System.in);

        //Chiedere il nome
        System.out.println("Qual'è il tuo nome?");
        String name = scan.nextLine();
    }
}
