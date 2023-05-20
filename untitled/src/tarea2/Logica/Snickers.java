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
         */
        public Snickers(){super();}
        @Override
        public void paint(Graphics g) {

        }
        /**
         *Se sobreescribe el metodo consumir()
         *@return "Snicker"
         */
        @Override
        public String consumir() {return "Snicker";}
    }

