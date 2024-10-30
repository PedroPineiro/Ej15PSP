public class HiloLector extends Thread {

    Buzon buzon;

    public HiloLector(Buzon buzon) {
        this.buzon = buzon;
    }

    public void leer(String mensaje) throws InterruptedException {
        buzon.setMensaje(mensaje);
        buzon.setValorMensaje(0);
        System.out.println("Mensaje leido: " + buzon.getMensaje());
    }

    public synchronized void run(){
        if(buzon.getValorMensaje() == 1){
            try {
                leer(buzon.getMensaje());
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            try{
                wait();
                notifyAll();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
