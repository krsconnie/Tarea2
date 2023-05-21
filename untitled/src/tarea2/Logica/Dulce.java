package tarea2.Logica;

import java.awt.*;

/**
 * Subclase de Producto,
 * representa modelo para Dulce
 */
public abstract class Dulce extends Producto {
    protected int serie;
    protected int x,y;
    public Dulce() {
        super();
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