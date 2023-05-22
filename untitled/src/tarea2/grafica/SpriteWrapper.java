package tarea2.grafica;

import tarea2.Logica.Sprite;

import javax.swing.*;
import java.awt.*;

/**Clase SpriteWrapper funciona como envoltorio de la clase sprite que contiene la lógica
 * el wrapper especifica los métodos visuales*/

public class SpriteWrapper extends JPanel {

    private Sprite sprite;
    private int x;
    private int y;

    /**Constructor. crea un objeto de la clase Sprite*/
    public SpriteWrapper() {
        sprite = new Sprite();
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
        g.setColor(Color.green);
        g.fillRect(this.x, this.y, 17, 30);
        g.setColor(Color.black);
        g.drawString(""+sprite.getSerie(), this.x, this.y+20);
    }
}