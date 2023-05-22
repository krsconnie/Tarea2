package tarea2.Logica;

import java.awt.*;

/**
 * Superclase "modelo" para las bebidas y los dulces
 */

public abstract class Producto {

    /**
     * se declara int que funciona como un identificador
     * del producto
     */
    private int serie;
    protected int x, y;

    /**
     * Constructor de Producto
     */
    public Producto() {
        this.serie = ((int) (Math.random() * 100));
        ;
    }
    /** Metodo consumir. al que se le hará override en sus subclases*/
    public abstract String consumir();

    /**
     * Método getSerie  devuelve la serie unica de Producto
     * @return serie
     */
    public int getSerie() {
        int s = serie;
        return serie;
    }

}