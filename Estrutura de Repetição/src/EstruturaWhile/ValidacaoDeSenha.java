/*
Este é o cenário perfeito para o while. 
Queremos que o usuário digite uma senha, 
e não vamos prosseguir enquanto ele não digitar a senha correta. 
Não sabemos quantas tentativas ele levará. 

 */

package EstruturaWhile;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String SENHA_SECRETA = "java121";
        System.out.print("Digite uma senha com 7 caractere: ");
        String senhaDigitada = teclado.nextLine();

        while (!senhaDigitada.equals(SENHA_SECRETA)){
            System.out.println("Senha incorreta ");
            System.out.print("Digite a senha novamente: ");

            senhaDigitada = teclado.nextLine();
            

        }
        System.out.println("Senha correta, pode entrar em sua conta ");
        teclado.close();
    }
}
