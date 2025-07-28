package EstruturaFor;

public class ExemploForEach {
    public static void main(String[] args) {
        String planetas [] = {"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter"};

        System.out.println("Planetas do Sistema Solar (parte 1):");

        for (String planeta: planetas){
            System.out.println("- "+ planeta);

        }

    }
}
