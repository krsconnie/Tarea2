package tarea2.grafica;

import tarea2.Logica.Super8;

import javax.swing.*;
import java.awt.*;

/**Clase Super8Wrapper funciona como envoltorio de la clase super8 que contiene la lógica
 * el wrapper especifica los métodos visuales*/

public class Super8Wrapper extends JPanel {

    private Super8 super8;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase super8*/

    public Super8Wrapper() {
        super8 = new Super8();
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
        g.setColor(Color.black);
        g.fillRect(this.x, this.y, 10, 38);
        g.setColor(Color.black);
        g.drawString(""+ super8.getSerie(), this.x, this.y+20);
    }
}