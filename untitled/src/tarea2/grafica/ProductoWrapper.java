package tarea2.grafica;

import tarea2.Logica.Producto;

import javax.swing.*;
import java.awt.*;

public class ProductoWrapper extends JPanel {

    private Producto producto;
    private int x;
    private int y;

    public ProductoWrapper(Producto producto) {
        this.producto = producto;
    }

    public String consumir() {
        return producto.consumir();
    }

    public int getSerie() {
        return producto.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        producto.setXY(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
    }
}
