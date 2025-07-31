package TratamentoExceções;

public class ExemploExcecao {
    public static void main(String[] args) {

        try {
            int numero = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro do Tipo " + e);
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }
}
