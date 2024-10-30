public class Buzon {

    private String mensaje;
    private int valorMensaje = 0;

    public Buzon(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getValorMensaje() {
        return valorMensaje;
    }

    public void setValorMensaje(int valorMensaje) {
        this.valorMensaje = valorMensaje;
    }
}
