package edu.henrique.condicaosimples;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.8;
        double valorSolicitado = 80.9;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            
        }else{
            System.out.println("saldo insuficiente");
        }
        System.out.println(saldo);
    }
}
