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
     *
     * @param s único int
     *          el valor entero de s
     */
    public Producto() {
        this.serie = ((int) (Math.random() * 100));
        ;
    }

    public abstract String consumir();

    /**
     * getSerie no tiene parametro de entrada.
     *
     * @return el valor entero de s
     */
    public int getSerie() {
        int s = serie;
        return serie;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}