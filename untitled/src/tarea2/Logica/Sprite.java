package tarea2.Logica;
import tarea2.Logica.Bebida;

import java.awt.*;

/**
 *Subclase de Bebida,
 *representa la bebida Sprite
 */
public class Sprite extends Bebida {
    /**
     *Constructor para los productos Sprite
     *@param s1 int
     */
    public Sprite() {
        super();
    }
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(this.x, this.y, 17, 30);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x, this.y+20);
    }
    /**
     *Se sobreescribe el metodo consumir()
     *@return "sprite"
     */
    @Override
    public String consumir() {
        return "sprite";
    }
}