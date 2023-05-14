package tarea2;
import java.awt.*;
/**
 * Subclase de Moneda, representa la moneda de 1000 pesos
 */
public class Moneda1000 extends Moneda {
    /**
     * Constructor de Moneda1000
     * le otorga a la variable valor = 1000
     */
    public Moneda1000() {
        super();
        super.valor = 1000;
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
        g.setColor(new Color(173,255,8));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x+3, this.y+15);
    }

    @Override
    public int compareTo() {
        return 0;
    }
}