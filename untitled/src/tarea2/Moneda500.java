package tarea2;
import java.awt.*;

/**
 Subclase de Moneda, representa la moneda de 500 pesos
 */
public class Moneda500 extends Moneda {
    /**
     *Constructor de Moneda500
     *le otorga a la variable valor = 500
     */
    public Moneda500() {
        super();
        super.valor = 500;
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
        g.setColor(new Color(255,148,8));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x+3, this.y+15);
    }

    @Override
    public int compareTo() {
        return 0;
    }
}