package tarea2.grafica;

import tarea2.Logica.Producto;

import javax.swing.*;
import java.awt.*;

/**Clase ProductoWrapper funciona como envoltorio de la clase producto que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class ProductoWrapper extends JPanel {

    private Producto producto;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase producto*/
    public ProductoWrapper(Producto producto) {
        this.producto = producto;
    }

    /**Método setXY para delimitar las coordenadas del objeto*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**Método paint que dibuja al objeto*/
    @Override
    protected void paintComponent(Graphics g) {
    }
}
