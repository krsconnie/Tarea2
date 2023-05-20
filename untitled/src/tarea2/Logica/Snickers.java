package tarea2.Logica;
import tarea2.Logica.Dulce;

import java.awt.*;
    /**
     *Subclase de Dulce,
     *representa los Snickers
     */
    public class Snickers extends Dulce {
        /**
         *Constructor para Snickers
         *@param s2 int
         */
        public Snickers(){super();}
        public void paint(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(this.x, this.y, 10, 38);
            g.setColor(Color.black);
            g.drawString(""+this.serie, this.x, this.y+20);
        }
        /**
         *Se sobreescribe el metodo consumir()
         *@return "Snicker"
         */
        @Override
        public String consumir() {return "Snicker";}
    }

