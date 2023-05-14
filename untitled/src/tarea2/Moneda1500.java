package tarea2;
import java.awt.*;
/**
 * Subclase de Moneda, representa la moneda de 1500
 */
public class Moneda1500 extends Moneda {
    /**
     * Constructor de Moneda1500
     * le otorga a la variable valor = 1500
     */
    public Moneda1500() {
        super();
        super.valor = 1500;
    }
    /**
     * metodo getValor() no tiene parametros
     * @return int valor, cantidad de $
     */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
    public void paint(Graphics g) {
        g.setColor(new Color(38,219,255));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x+3, this.y+15);
    }

    @Override
    public int compareTo() {
        return 0;
    }
}