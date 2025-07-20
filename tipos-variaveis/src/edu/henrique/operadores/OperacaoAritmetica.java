package edu.henrique.operadores;
import java.util.Scanner; 

public class OperacaoAritmetica {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite primeiro valor: "); 
        double valor1 = leitura.nextDouble();
        
        System.out.print("Digite o Segundo valor: ");
        double valor2 = leitura.nextDouble();
        
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double divisao = valor1 / valor2;
        double multiplicacao = valor1 * valor2;
        double resto = valor1 % valor2;

        System.out.format("Os Valores Digitados são: %.2f e %.2f \n", valor1, valor2);

        System.out.println("A Soma = " + soma);
        System.out.println("A Subtração = " + subtracao);
        System.out.format("A Divisão = %.2f ", divisao);
        System.out.println("A Multiplicação = " + multiplicacao);
        System.out.println("O Resto = " + resto);
        

    }
}
