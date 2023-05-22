package tarea2.grafica;
import tarea2.Logica.Bebida;

import javax.swing.*;
import java.awt.*;

/**Clase BebidaWrapper funciona como envoltorio de la clase bebida que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class BebidaWrapper extends JPanel {

    private Bebida bebida;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase bebida*/
    public BebidaWrapper(Bebida bebida) {
        this.bebida = bebida;
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