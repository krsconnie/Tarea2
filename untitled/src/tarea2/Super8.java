package tarea2;
import java.awt.*;
/**
 *Subclase de Dulce,
 *representa los Super8
 */
public class Super8 extends Dulce{
    /**
     *Constructor para los Super8
     *@param s2 int
     */
    public Super8(int s2){super(s2);}
    /**
     *Se sobreescribe el metodo consumir()
     *@return String "Super8"
     */
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.x, this.y, 10, 38);
        g.setColor(Color.black);
        g.drawString(""+this.serie, this.x, this.y+20);
    }
    public String consumir(){return "Super8";}
}