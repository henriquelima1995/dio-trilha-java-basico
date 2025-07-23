package edu.henrique.condicaocomposta;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 2;

        if (nota >= 8) {
            System.out.println("aluno provado");
        } else if (nota >= 6 && nota < 8) {
            System.out.println("Passou pelo conselho de curso");
        } else if (nota >= 3 && nota < 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Resprovou");
        }
    }
}
