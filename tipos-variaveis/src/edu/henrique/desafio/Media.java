package edu.henrique.desafio;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double primeiraNota = teclado.nextDouble();
        double segundaNota = teclado.nextDouble();

        double media = ((primeiraNota * 3.5) + (segundaNota * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", media);

    }
}
