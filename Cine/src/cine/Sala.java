package cine;

import java.util.ArrayList;

public class Sala {

    private int numero;
    private ArrayList<Butaca> butacas = new ArrayList();
    private Pelicula pelicula;

    public Sala(int numero) {
        this.numero = numero;
    }

    public Butaca buscarButacaLibre() {
        for (Butaca butaca : butacas) {
            if (butaca.isLibre()) {
                return butaca;
            }
        }
        return null;
    }
    
    public void liberarButacas(){
        for (Butaca butaca : butacas) {
            butaca.setLibre(true);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }

    public void setButacas(ArrayList<Butaca> butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}
