package tarea2.grafica;

import tarea2.Logica.CocaCola;

import javax.swing.*;
import java.awt.*;

/**Clase CocaColaWrapper funciona como envoltorio de la clase cocacola que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class CocaColaWrapper extends JPanel {

    private CocaCola cocacola;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase CocaCola*/
    public CocaColaWrapper() {
        cocacola = new CocaCola();
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
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x, y, 17, 30);
        g.setColor(Color.black);
        g.drawString("" + cocacola.getSerie(), x, y + 20);
    }
}