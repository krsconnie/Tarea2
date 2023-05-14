package tarea2;
import java.awt.*;
/**
 Subclase de Moneda,
 representa la moneda de 100 pesos
 */
public class Moneda100 extends Moneda {
    /**
     *Constructor de Moneda100
     *le otorga a la variable (llamada con super)
     *valor = 100
     */
    public Moneda100() {
        super();
        super.valor = 100;
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
        g.setColor(Color.yellow);
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x+3, this.y+15);
    }
    @Override
    public int compareTo() {
        return 0;
    }
}