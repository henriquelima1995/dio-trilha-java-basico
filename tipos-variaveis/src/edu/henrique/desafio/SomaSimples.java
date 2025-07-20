package edu.henrique.desafio;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primeiroValor = teclado.nextInt(); 
        int segundoValor = teclado.nextInt(); 
        
        int soma = primeiroValor + segundoValor ;

        System.out.println("SOMA = " + soma);


    }
}
