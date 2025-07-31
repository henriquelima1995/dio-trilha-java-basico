//throw
//Usado para lançar uma exceção manualmente.

package TratamentoExceções;
public class TesteIdade {
    public static void main(String[] args) {
        
        try {
            int numero  = 78 / 0;
        } catch (ArithmeticException e){
            System.out.println("Erro encontrado "+ e);
        }
    }
}
