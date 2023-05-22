package tarea2.Logica;

import java.awt.*;

/**
 *Subclase de Producto,
 *representa modelo para Bebida
 */
public abstract class Bebida extends Producto {
    int serie;
    protected int x,y;
    /**
     * Constructor de Producto
     */

    public Bebida() {
        super();
    }

    public abstract String consumir();

    /**
     * Método getSerie  devuelve la serie unica de Bebida
     * @return serie
     */
    public int getSerie() {
        int s = serie;
        return serie;
    }
}