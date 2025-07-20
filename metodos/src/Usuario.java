public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv Está ligada? " + smartTv.ligada);
        System.out.println("Qual volume inicial? " + smartTv.volume);
        System.out.println("Qual Canal a tv se encontra? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(98);
        smartTv.ligar();
        System.out.println("Novo Status Tv está ligada? "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status Tv está ligada? "+smartTv.ligada);
        System.out.println("Atualização do volume atual: " + smartTv.volume);
    }
}
