public class Main {
    public static void main(String[] args) {
        HiloEscritor hiloEscritor1 = new HiloEscritor(new Buzon("Escrito por el HiloEscritor 1"));
        HiloEscritor hiloEscritor2 = new HiloEscritor(new Buzon("Escrito por el HiloEscritor 2"));
        HiloEscritor hiloEscritor3 = new HiloEscritor(new Buzon("Escrito por el HiloEscritor 3"));

        HiloLector hiloLector1 = new HiloLector(new Buzon("Leído por el HiloLector 1"));
        HiloLector hiloLector2 = new HiloLector(new Buzon("Leído por el HiloLector 2"));
        HiloLector hiloLector3 = new HiloLector(new Buzon("Leído por el HiloLector 3"));


        hiloEscritor1.start();
        hiloEscritor2.start();
        hiloEscritor3.start();
        hiloLector1.start();
        hiloLector2.start();
        hiloLector3.start();

    }
}
