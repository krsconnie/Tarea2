package tarea2;

import java.awt.*;

/**
 *Subclase de Producto,
 *representa modelo para Bebida
 */
public abstract class Bebida extends Producto{
    int serie;
    protected int x,y;
    /**
     * Constructor de Producto
     * @param s único int
     */

    public Bebida(int s) {
        super(s);
    }

    public abstract String consumir();
    public int getSerie() {
        int s = serie;
        return serie;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void paint(Graphics g);
}