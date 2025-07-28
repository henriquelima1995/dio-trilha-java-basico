package EstruturaFor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o Valor Que deseja calcular: ");
        int numero = teclado.nextInt();
        
        for(int contador = 0; contador <= 10; contador ++){

            int resultado = numero * contador;
            System.out.format("%d X %d = %d\n", contador, numero, resultado);

        }
        System.out.println("Fim do Programa!");
    }
}
