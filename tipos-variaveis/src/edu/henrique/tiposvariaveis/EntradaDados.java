package edu.henrique.tiposvariaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Qual tua idade? ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer

        System.out.print("Qual tua altura? ");
        float altura = teclado.nextFloat();

        System.out.format("Olá %s \nvocê tem %d anos. \nCom a altura %.2f metros", nome, idade, altura);
    }
}
