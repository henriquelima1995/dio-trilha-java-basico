package edu.henrique.desafio;
import java.util.Scanner;

public class MultiplicaçãoSimples {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o primeiro valor: ");
    int primeiroValor = teclado.nextInt();

    System.out.print("Digite o segundo valor: ");
    int segundoValor = teclado.nextInt();

    int PROD = primeiroValor * segundoValor;

    System.out.println("PROD = " + PROD);
    }
}
