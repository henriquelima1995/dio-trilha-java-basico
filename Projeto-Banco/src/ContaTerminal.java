import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o número da Agência: ");
        int numeroAgencia = teclado.nextInt();
        teclado.nextLine(); // limpa o \n que sobrou do nextInt

        System.out.print("Digite o número da conta: ");
        String numeroConta = teclado.nextLine(); 

        System.out.print("Digite o saldo da conta: ");
        double saldo = teclado.nextDouble();

        

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Seu saldo é de R$ %.2f e já está disponível para saque.\n", saldo);
    }

}
