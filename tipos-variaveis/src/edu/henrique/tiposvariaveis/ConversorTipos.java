package edu.henrique.tiposvariaveis;

public class ConversorTipos {
    public static void main(String[] args) {
        // String para int
        String numeroString = "123";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("String para int: " + numeroInt);

        // String para Double

        String alturaString = "175";   
        double alturaFloat = Double.parseDouble(alturaString);
        System.out.println("String para float: " + alturaFloat);

        // int para String
        int numero = 456;
        String numeroParaString = Integer.toString(numero);
        System.out.println("int para String: " + numeroParaString);

       
    }
}
