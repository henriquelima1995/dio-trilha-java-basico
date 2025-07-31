package candidatura;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        
        
    }

    static void entrandoEmContato(){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{

            atendeu =atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato Realizdo com sucesso");
            }
        } while( continuarTentando && tentativasRealizadas < 3);
    }

    // Método auxilar
    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }
    static void imprimirCandidatos(){
        String [] candidatos = {"Ana", "Felipe", "André", "Bruno", "Paulo"};
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O Candidato de é " + candidatos[indice]);
        }
        for (String candidato : candidatos){
            System.out.println(candidato);
        }
    }

    static void selecaoCandidator(){
        String [] candidatos = {"Ana", "Felipe", "Maria", "Matheus", "Flávia", "Pedro", "Bruno", "Bruna","Livia","Pablo"};

        int candidatosSelecionados = 0;
        int cadidatosAtual = 0;
        double salarioBase =2000.0;

        while (candidatosSelecionados < 5 && cadidatosAtual < candidatos.length) {
            String candidato = candidatos[cadidatosAtual];
            double salarioPrentendido = valorPrentendido();
            System.out.format("O Candidato (a) %s escolheu o valor R$%.2f\n", candidato, salarioPrentendido);

            if (salarioPrentendido <= salarioBase){
                System.out.println("O Canditado "+ candidatos[cadidatosAtual] + " foi selecionado");
                candidatosSelecionados++;
            }
            cadidatosAtual++;

        }
    }  
    
    static double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2250);
    }

    
}
