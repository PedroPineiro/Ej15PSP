public class HiloEscritor extends Thread {

     Buzon buzon;

    public HiloEscritor(Buzon buzon) {
        this.buzon = buzon;
    }

    public void escribir(String mensaje) throws InterruptedException {
        buzon.setMensaje(mensaje);
        buzon.setValorMensaje(1);
        System.out.println("Mensaje escrito: " + buzon.getMensaje());
    }

    public synchronized void run(){

        for(int i = 0; i < 3; i++) {
            if (buzon.getValorMensaje() == 0) {
                try {
                    escribir(buzon.getMensaje());
                    Thread.sleep(1000);
                    buzon.setValorMensaje(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    wait();
                    notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
