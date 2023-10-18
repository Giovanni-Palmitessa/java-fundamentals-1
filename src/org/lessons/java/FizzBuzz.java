package org.lessons.java;
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + "numero: " + i + ")");
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + "(numero: " + i + ")");
            } else if (i % 5 == 0) {
                System.out.println("Buzz "+ "(numero: " + i + ")");
            } else {
                System.out.println(i);
            }
        }
    }
}
