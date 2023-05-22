package tarea2.grafica;
import tarea2.Logica.Dulce;

import javax.swing.*;
import java.awt.*;

/**Clase DulceWrapper funciona como envoltorio de la clase dulce que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class DulceWrapper extends JPanel {

    private Dulce dulce;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase dulce*/
    public DulceWrapper(Dulce dulce) {
        this.dulce = dulce;
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