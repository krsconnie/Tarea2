package tarea2.Logica;

import java.awt.*;

/**
 * Subclase de Producto,
 * representa modelo para Dulce
 */
public abstract class Dulce extends Producto {
    protected int serie;

    /**Constructor de Dulce*/
    public Dulce() {
        super();
    }

    /** Metodo consumir. al que se le hará override en sus subclases*/
    public abstract String consumir();

    /**Método getSerie devuelve la serie unica de dulce
     * @return serie */
    public int getSerie() {
        int s = serie;
        return serie;
    }

}