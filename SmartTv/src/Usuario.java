public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("canal atual: " + smartTv.canal);
        // smartTv.diminuirVolume();
        // smartTv.diminuirVolume();
        // smartTv.diminuirVolume();
        // smartTv.aumentarVolume();
        // System.out.println("novo status -> volume atual: " + smartTv.volume);


        // System.out.println("tv ligada? " + smartTv.ligada);
        
        // System.out.println("volume atual: " + smartTv.volume);
        
        // smartTv.ligar();
        // System.out.println("novo status -> tv ligada? "  + smartTv.ligada);
        // smartTv.desligar();
        // System.out.println("novo status -> tv ligada? "  + smartTv.ligada);

    }
}