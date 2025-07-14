package edu.henrique.tiposvariaveis;

public class Exemplo1 {
    public static void main( String[] args){
        String nome = "Henrique";
        int idade = 30;
        long cpf = 25896398715l;
        String cidade = "São Paulo";
        char sexo = 'M';
        boolean casado = false;
        float peso = 74.58f;
        double altura = 1.80;
        
        System.out.format("Seu nome é %s no Sexo %c \n" ,nome, sexo);
        System.out.format("Sua idade é %d \n", idade);
        System.out.format("%s Voce tem %.2f Kg, com a altura %.2f Metros. \n",nome, peso, altura);
        System.out.format("Mora na Cidade %s com o CPF %d. \n",cidade, cpf);
        System.out.format("Casado? %b. \n",casado);
        
    }
    
}
