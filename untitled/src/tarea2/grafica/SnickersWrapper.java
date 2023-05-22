package tarea2.grafica;

import tarea2.Logica.Snickers;

import javax.swing.*;
import java.awt.*;

/**Clase SnickersWrapper funciona como envoltorio de la clase snickers que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class SnickersWrapper extends JPanel {

    private Snickers snickers;
    private int x;
    private int y;
    /**Constructor. crea un objeto de la clase Snicker*/
    public SnickersWrapper() {
        snickers = new Snickers();
    }

    /**Método setXY para delimitar las coordenadas del objeto
     * @param x
     * @param y*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }
    /**Método paint que dibuja al objeto*/
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(this.x, this.y, 10, 38);
        g.setColor(Color.black);
        g.drawString(""+snickers.getSerie(), this.x, this.y+20);
    }
}