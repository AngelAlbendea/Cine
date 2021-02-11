package cine;

public class Butaca {

    private int fila, numero;
    private boolean libre;

    public Butaca(int fila, int numero, boolean libre) {
        this.fila = fila;
        this.numero = numero;
        this.libre = libre;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

   
}
