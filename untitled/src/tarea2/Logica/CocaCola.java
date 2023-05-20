package tarea2.Logica;
import tarea2.Logica.Bebida;

import java.awt.*;

/**
 *Subclase de Bebida,
 * representa la bebida CocaCola
 */
public class CocaCola extends Bebida {
    /**
     *Constructor para los productos CocaCola
     * @param s1 int
     */
    public CocaCola() {
        super();
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(this.x, this.y, 17, 30);
        g.setColor(Color.black);
        g.drawString("" + this.serie, this.x, this.y+20);
    }
    /**
     *Se sobreescribe el método consumir()
     *@return "cocacola
     */
    @Override
    public String consumir() {
        return "cocacola";
    }
}